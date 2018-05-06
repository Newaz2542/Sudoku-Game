package application;

import java.io.IOException;
import java.util.List;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
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

	public void createSelect(ActionEvent ac) {
		Node node = null;

		for (int a = 0; a < save.getNum(); a++) {
			for (int b = 0; b < save.getNum(); b++) {
				GridPane gridMinor = grid.getGridMinor().get((save.getNum()*a)+b);
				node = grid.getNodeByRowColumnIndex(a, b);
				Label text = (Label) node;
				System.out.println(text);
				SelectFX select = new SelectFX();
				text.setOnMousePressed(e -> {
					gridMinor.getChildren().add(select.getRootPane());
					
				});
				text.setOnMouseReleased(e -> {
					gridMinor.getChildren().remove(select.getRootPane());
				});

			}
		}
		
//		Scene scene = new Scene(root);
//		Stage stage = (Stage) ((Node) ac.getSource()).getScene().getWindow();
//		stage.setScene(scene);
//		stage.setResizable(false);
//		stage.show();

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