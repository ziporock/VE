package ungs.edu.ve.datamapper;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class DataMapperImpl {

	
	public static <T> Collection<T> map(ResultSet resultSet, DataMapper<T> mapper) throws SQLException {
	    Collection<T> mappedObjects = new LinkedList<T>();
	    while(resultSet.next() ){
	        mappedObjects.add(mapper.mapRow(resultSet));
	    }
	    return mappedObjects;
	}
	
	
	public List<String> getAtributos (String clase) throws ClassNotFoundException{
		List<String> atributos=new ArrayList<String>();
		Class userClass = Class.forName(clase);
		Field[] userFields = userClass.getDeclaredFields();
		for (Field field : userFields) {
			atributos.add(field.getName());
		}
		return atributos;
	}
	
	
}
