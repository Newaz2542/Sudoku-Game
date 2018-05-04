package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GridController {
	@FXML
	BorderPane pane;

	private Grid grid;
	private Save save;
	@FXML
	public void initialize() {
		grid = new Grid(save.getNum());
		pane.setCenter(grid.getGridMain());

	}

	public void handleDone(ActionEvent ac) {
		try {
			Parent pane = FXMLLoader.load(getClass().getResource("Scoreboard.fxml"));
			Scene scene = new Scene(pane);
			Stage stage = (Stage) ((Node) ac.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.setResizable(false);
			stage.show();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}