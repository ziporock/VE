package ungs.edu.ve.datamapper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.List;
public class DB {

	
	
	
	public static void main(String[] args)
	  {
	    try
	    {
	      // create our mysql database connection
	      String myDriver = "com.mysql.jdbc.Driver";
	      String myUrl = "jdbc:mysql://localhost/votoElectronico";
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection(myUrl, "root", "root");
	       
	      // our SQL SELECT query. 
	      // if you only need a few columns, specify them by name instead of using "*"
	      String query = "SELECT * FROM Persona";
	 
	      // create the java statement
	      Statement st = conn.createStatement();
	       
	      // execute the query, and get a java resultset
	      ResultSet rs = st.executeQuery(query);
	       
	      // iterate through the java resultset
	  	  PersonaMapper mapper=new PersonaMapper();
	  	  DataMapperImpl dataMapperImpl=new DataMapperImpl();
	  	 
	  	  Collection<Persona> list= dataMapperImpl.map(rs, mapper);
	  	 
	  	
	  	  
	  	//  while (rs.next()) {
	  	  for (Persona persona2 : list) {
	  		System.out.println(persona2.toString());
		}
	  	//}+	  	  }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	  }
	
}
