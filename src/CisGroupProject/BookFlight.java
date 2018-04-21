package CisGroupProject;
import java.sql.*;
public class BookFlight {
	public static void main(String[]args){
		
			try {
				Connection myco = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema?autoReconnect=true&useSSL=false", "root", "Meet1143");
				//
				Statement myStat = myco.createStatement();
				//
				ResultSet myRs = myStat.executeQuery("select* from Flight");
		/*while(myStat)
		{
			
		}*/
	}
		catch(Exception exc){
			exc.printStackTrace();
		}

}
}
