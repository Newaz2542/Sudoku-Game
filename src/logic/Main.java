package logic;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	
	
	public static void main(String[] arg) {
		launch(arg);
	}
	@Override
	public void start(Stage stage) throws Exception {
		try {
		BorderPane pane = (BorderPane)FXMLLoader.load(getClass().getResource("GridUI.fxml"));	
//		URL url = new URL("GridUI.fxml");
//		FXMLLoader load = new FXMLLoader(url);
//		AnchorPane pane = load.load();
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("GridShow");
		stage.setFullScreen(true);
		stage.show();
		}
		catch(IOException e) {
			System.err.println(e.getMessage());
		}
	}

}
