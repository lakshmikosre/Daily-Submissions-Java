package softt_JDBC;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class JDBCUpdate {

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
	Connection con = null;
			
			// Load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Establish a connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "root");
			
			Statement st = con.createStatement();
	int rowCount = st.executeUpdate("update  employees set  city=' Mumbai ' where id = 101");
			
			if (rowCount == 1) {
				System.out.println("Update successfully");
			} else {
				System.out.println("Updation failed..........");
			}
			
			// Close resources
			st.close();
			con.close();
		


		}

	}


