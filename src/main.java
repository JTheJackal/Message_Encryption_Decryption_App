/**
 * 
 */

/**
 * @author Joshua Styles
 * 
 *Desktop application for encrypting and decrypting text based messages.
 */

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class main extends Application implements EventHandler<ActionEvent>{

	/**
	 * @param args
	 */
	
	private final static int windowWidth = 800;
	private final static int windowHeight = 500;
	private final static int fontSize = 16;
	private final static String font = "georgia";
	
	private final static String menuBGCol = "#212121";
	private final static String contentBGCol = "#013243";
	
	private Button button;
	private final Background menuBG = new Background( new BackgroundFill( Color.web( menuBGCol ), CornerRadii.EMPTY, Insets.EMPTY ) );
	private final Background contentBG = new Background( new BackgroundFill( Color.web( contentBGCol ), CornerRadii.EMPTY, Insets.EMPTY ) );

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set up JavaFX Application
		launch(args);
	}
	
	@Override
	public void start(Stage window) throws Exception {
		
		window.setTitle("M.E.D.I.A");
		
		button = new Button("Encrypt");
		button.setOnAction(this);
		button.setMinSize(150, 150);;
		
		//The main layout for the window.
		BorderPane layout = new BorderPane();
		//layout.getChildren().add(button);
		
		//The layout for the menu bar on the left.
		VBox menu = new VBox();
		//The layout for the content section
		GridPane content = new GridPane();
		
		//Properties for the VBox
		menu.setPadding(new Insets(10));
		menu.setSpacing(8);
		menu.setBackground(menuBG);
		menu.setPrefWidth(150);
		
		//Set up the grid properties
		content.setHgap(10);
		content.setVgap(10);
		content.setPadding(new Insets(10, 10, 10, 10));
		content.setBackground(contentBG);
		
		//Set up content elements
		Text encryptTXT = new Text("Enter the message you wish to encrypt.");
		Text typeTXT = new Text("Select which type of encryption you wish to use.");
		Text secretKeyTXT = new Text("Enter a secret key.");
		
		//Set font sizes for text elements.
		encryptTXT.setStyle("-fx-font: " + fontSize + " " + font + ";");
		typeTXT.setStyle("-fx-font: " + fontSize + " " + font + ";");
		secretKeyTXT.setStyle("-fx-font: " + fontSize + " " + font + ";");
		
		TextField encryptInput = new TextField();
		encryptInput.setMinSize(630, 100);
		
		TextField secretKeyInput = new TextField();
		secretKeyInput.setMaxSize(100, 50);
		secretKeyInput.setMinSize(100, 50);
		
		ChoiceBox typeChoice = new ChoiceBox(FXCollections.observableArrayList("Simple", "RSA"));
		typeChoice.setMaxSize(100, 50);
		typeChoice.setMinSize(100, 50);
		
		//Add content to the grid
		content.add(encryptTXT, 0, 0, 5, 1);
		content.add(encryptInput, 0, 1, 5, 3);
		content.add(secretKeyInput, 0, 4);
		content.add(secretKeyTXT, 1, 4);
		content.add(typeChoice, 0, 5);
		content.add(typeTXT, 1, 5);
		content.add(button, 4, 8);
		
		content.setHalignment(button, HPos.RIGHT);
		
		//Arrange the scene
		layout.setLeft(menu);
		layout.setCenter(content);
		
		Scene scene = new Scene(layout, windowWidth, windowHeight);
		window.setScene(scene);
		window.show();
		
	}
	
	@Override
	public void handle(ActionEvent event) {
		
		if(event.getSource() == button) {
			
			System.out.println("Button was pressed");
		}
	}

}
