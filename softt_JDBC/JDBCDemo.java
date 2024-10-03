package softt_JDBC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws Exception {
		
		Connection con = null;
		
		// Load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish a connection
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "root");
		
		Statement st = con.createStatement();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the player id");
		int id = Integer.parseInt(br.readLine());  // Correct way to read integer
		
		System.out.println("Enter the player name");
		String name = br.readLine();
		
		System.out.println("Enter the player post");
		String post = br.readLine();
		
		System.out.println("Enter the player salary");
		float salary = Float.parseFloat(br.readLine());
		
		System.out.println("Enter the player's city");
		String city = br.readLine();
		
		// Correctly formatted SQL query
		String query = "INSERT INTO employees (id, name, post, city, salary) VALUES (" +
						id + ", '" + name + "', '" + post + "', '" + city + "', " + salary + ")";
		
		int rowCount = st.executeUpdate(query);
		
		if (rowCount == 1) {
			System.out.println("Data inserted successfully");
		} else {
			System.out.println("Data insertion failed");
		}
		
		// Close resources
		st.close();
		con.close();
	}
}
