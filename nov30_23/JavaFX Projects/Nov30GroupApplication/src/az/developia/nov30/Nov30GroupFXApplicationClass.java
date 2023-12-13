package az.developia.nov30;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Nov30GroupFXApplicationClass extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage){
		
		try {
			 AnchorPane pane = FXMLLoader.load(getClass().getClassLoader().getResource("az/developia/nov30view/main.fxml")); 
			 Scene scene = new Scene(pane);
			 stage.setScene(scene);
			 stage.setTitle("Nov30 Group Application");
			 Image iconImage = new Image("az/developia/nov30/resources/coding.png");
			 stage.getIcons().add(iconImage);  
			 stage.show();
		} catch (IOException e) {
			e.printStackTrace();
	}
	
	}			
}
