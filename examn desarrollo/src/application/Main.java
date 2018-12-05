package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {

	private AnchorPane mainPane;

	@Override
	public void start(Stage primaryStage) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/huip.fxml"));
		try {
			mainPane = (AnchorPane) loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		primaryStage.setTitle("huip.fxml");
		primaryStage.setScene(new Scene(mainPane));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
