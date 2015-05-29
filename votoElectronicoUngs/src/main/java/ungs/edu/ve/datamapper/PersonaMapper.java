package ungs.edu.ve.datamapper;


import java.sql.ResultSet;
import java.sql.SQLException;



public class PersonaMapper  implements DataMapper<Persona> {

    @Override
    public  Persona mapRow(ResultSet resultSet) throws SQLException {
      
    	Persona bean = new Persona();
    
    	bean.setFirstName(resultSet.getString("firstname"));
        bean.setLastName(resultSet.getString("lastname"));
        bean.setAge(resultSet.getInt("age"));
   
        return bean;
    }

    
 
}