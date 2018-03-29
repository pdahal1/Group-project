package CisGroupProject;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainMenu {
	public static void main( String [] args) throws Exception {
		getConnection();
		
	}
	public static Connection getConnection() throws Exception{
		try {
				String driver= "com.mysql.jdbc.Driver";
				String url="jdbc:mysql://131.96.101.119:3306/lab 3";
				String username = "c##Pdahal19985";
				String password ="okif8455";
				Class.forName(driver);
				Connection con= DriverManager.getConnection(url, username, password);
				System.out.println("connectd.");
				return con; 
	} catch (Exception e) {System.out.println(e);}
	return null;
	}
}
