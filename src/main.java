/**
 * 
 */

/**
 * @author Joshua Styles
 * 
 *Desktop application for encrypting and decrypting text based messages.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class main extends Application{

	/**
	 * @param args
	 */
	
	private Button button;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set up JavaFX Application
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("M.E.D.I.A");
		
		button = new Button("Encrypt");
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 800, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
