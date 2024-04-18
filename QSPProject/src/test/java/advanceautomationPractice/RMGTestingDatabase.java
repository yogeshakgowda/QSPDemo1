package advanceautomationPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class RMGTestingDatabase {

	public static void main(String[] args) throws SQLException {
		// Step 1 Register Driver
				Driver driver = new Driver();
				DriverManager.registerDriver(driver);

				// step 2 Get connection from database
				Connection con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");

				// Step 3 Create statement

				Statement statement = con.createStatement();
				String query = "use projects;";
				String query1= "select * from project";
				;
				
				ResultSet result = statement.executeQuery(query1);
				System.out.println(result.getMetaData());//to see the table structure
//				int n=0;
//				while(result.next()) {
//					n++;
//					System.out.println(result.getString(1)+ " "+result.getString(2)+ " "+result.getString(3)+ " "+result.getString(4)+ " "+result.getString(5)+ " "+result.getString(6)+ " ");
//				}
//				System.out.println(n);
				

	}

}
