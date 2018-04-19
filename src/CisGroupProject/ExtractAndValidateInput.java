package CisGroupProject;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExtractAndValidateInput extends Application {
	Stage window; 
	Scene scene; 
	Button button; 
	Button clearButton= new Button("clear");
	public static void main(String[] args) {
		launch(args);
	}

	
	public void start(Stage PrimaryStage) throws Exception {
		window= PrimaryStage;
		window.setTitle("Extract");
		
		TextField nameInput= new TextField();
		TextField result= new TextField();
				
		button = new Button("Click here");
		button.setOnAction(e-> { isInt(nameInput, nameInput.getText());
		result .setText("vola");
		
			});
		clearButton.setOnAction(e-> nameInput.clear());
		
		VBox layout= new VBox();
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(nameInput, button, result, clearButton);
		
		scene= new Scene(layout, 300,300);
		window.setScene(scene);
		window.show();
		
	}
	private boolean isInt( TextField input, String message){
		try{
			int age= Integer.parseInt(input.getText());
			System.out.println("user is " + age + "years old.");
			return true; 
			
		} catch( NumberFormatException e){
			System.out.println("Error: " + message + " is not number");
			
		
		return false;
	}
	}
}

