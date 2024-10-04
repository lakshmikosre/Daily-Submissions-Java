package softt_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCSelect {

	public static void main(String[] args)throws Exception {
		
		Connection con = null;
		
		// Load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish a connection
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "root");
		
		Statement st = con.createStatement();
      
      ResultSet rs = st.executeQuery("SELECT * FROM employees");
      
      while(rs.next())
      {
    	  int id = rs.getInt("id");
    	  String name = rs.getString("name");
    	  String post = rs.getString("post");
    	  String city = rs.getString("city");
    	  float salary = rs.getFloat("salary");
    	  
    	  System.out.println("---------------------Employee Details---------------------------");
    	  System.out.println("-----------------------------------------------------------------------");
    	  System.out.println("Player ID    :" +id);
    	  System.out.println("Player Name    :" +name);
    	  System.out.println("Player post    :" +post);
    	  System.out.println("Player city    :" +city);
    	  System.out.println("Player salary    :" +salary);
    	  
      }
	}

}
