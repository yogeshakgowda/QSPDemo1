package advanceautomationPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBCConcept {

	public static void main(String[] args) throws SQLException {
		// non select queries

		// Step 1 Register Driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);

		// step 2 Get connection from database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");

		// Step 3 Create statement

		Statement statement = con.createStatement();
//		String query="create database easywhiz1;";//for creating database
		String query1 = "use easywhiz";
		String query2 = "create table Seller(Name varchar(10),Mobile bigint(20), email varchar(20), store varchar(15));";	
		String query3="insert into Seller values('Manoj', '99887766' , 'sonu@gmail.com','ABC');";
//		String query4="insert into Seller values('Saurabh', '9988746' , 'Monu@gmail.com','BCD');";
//		String query5="insert into Seller values('Shukla', '99287722' , 'heer@gmail.com','EFG');";
//		String query6="insert into Seller values('Prakash', '91887766' , 'ramu@gmail.com');";
//		String query7="insert into Seller values('riya', '89887766' , 'riya@gmail.com');";
		// String query8="select * from customer where ;";

		// step 4 Execute query
		statement.executeUpdate(query1);
		 statement.executeUpdate(query2);
//		statement.executeUpdate(query3);
//		statement.executeUpdate(query4);
//		statement.executeUpdate(query5);
//		statement.executeUpdate(query6);
//		statement.executeUpdate(query7);
//		ResultSet result = statement.executeQuery(query8);
//		while(result.next()) {
//			System.out.println(result.getString(1)+" "+result.getString(2)+"  " +result.getString(3));
//		}

		// step 5 close the database

		con.close();

	}

}
