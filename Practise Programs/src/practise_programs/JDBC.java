package practise_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/c02","root","Meghashyam@73");
		Statement stmt = connect.createStatement();
		
		String query = "create table products(id int,product_name varchar(25),price_of_each_unit int,no_of_units int)"; 
		      
		query = "insert into products(id,product_name,price_of_each_unit,no_of_units)"
				+"values(2,'Rice',60,30)";
		
		query = "select * from products";
		
		ResultSet result = stmt.executeQuery(query);
		
		while(result.next()) {
			System.out.println(result.getInt(1) + " , "+result.getString(2)+ " , " +result.getInt(3) + " , "
					+result.getInt(4));

		}
		result.close();

	}
}
