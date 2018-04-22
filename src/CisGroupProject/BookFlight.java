package CisGroupProject;
import java.sql.*;

import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class BookFlight {
	public static void getFlightInfo(String[]args){
		
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

	public class BookFlight extends Application implements EventHandler<ActionEvent> {
				
		Button enter;

		public static void main(String[] args)
		{
			launch(args);
		}
				
		@Override
		public void start(Stage bookFlight) throws Exception {
					
			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25, 25, 25, 25));
					
			Scene scene = new Scene(grid, 300, 275);
			bookFlight.show();
					
			bookFlight.setTitle("Book Your Flight");
					
			Label flyingFrom = new Label("Flying From: ");
			grid.add(flyingFrom, 0, 1);
					
			TextField flyingFromText = new TextField();
			grid.add(flyingFromText, 1, 1);
					
					
			Label flyingTo = new Label("Flying From: ");
			grid.add(flyingTo, 0, 1);
					
			TextField flyingToText = new TextField();
			grid.add(flyingToText, 1, 1);
					
					
					
					
			enter = new Button();
			enter.setText("Enter");
			enter.setOnAction(this);
					
			grid.getChildren().add(enter);
				
		}

		@Override
		public void handle(ActionEvent arg0) {
				
					
		}
				  
	}

}
}
