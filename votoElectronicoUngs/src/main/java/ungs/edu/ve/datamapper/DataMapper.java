package ungs.edu.ve.datamapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DataMapper<T> {

	public T mapRow(ResultSet resultSet) throws SQLException;

	
}