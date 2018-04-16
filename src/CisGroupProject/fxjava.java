package CisGroupProject;

import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.stage.Stage;

public class fxjava extends Application {
	Button button;
	

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Helloworld");
		button = new Button();
		Button button1= new Button("what you do");
		
		button.setText("Click me");
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
//		layout.getChildren().add(button1);

		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void handle(ActionEvent event) {

	}
}
