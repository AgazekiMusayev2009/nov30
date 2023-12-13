package az.developia.nov30.imagehistoryapp.controller;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

public class ImageHistoryController{

	@FXML
	private ImageView appimage;
	
	@FXML
	private Button chooseImageButton;
	
	@FXML
	private Button historyButton;
	
	@FXML
	private void chooseImageButtonClicked(ActionEvent event) {
		FileChooser chooser = new FileChooser();
		File selectedFile = chooser.showOpenDialog(null);

		Image image = new Image(selectedFile.getAbsolutePath());
		appimage.setImage(image);
	}
	
	@FXML
	private void historyButtonClicked(ActionEvent event) {
		
	}
	
	
}
  