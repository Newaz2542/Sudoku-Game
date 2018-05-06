package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;

public class SelectFX {
	private final Pane rootPane;
	private final GridPane gridPane;
	private Save save;

	public SelectFX() {
		rootPane = new Pane();
		gridPane = new GridPane();
		rootPane.setStyle("-fx-background-colur:black;");
		rootPane.setPrefSize(200, 200);;
		
		for (int i = 0; i < save.getNum(); i++) {
			ColumnConstraints column = new ColumnConstraints(50);
			gridPane.getColumnConstraints().add(column);
			RowConstraints rows = new RowConstraints(50);
			gridPane.getRowConstraints().add(rows);
		}
		addNumber();
		gridPane.setGridLinesVisible(true);
		rootPane.getChildren().add(gridPane);
		rootPane.setVisible(true);
	}
	
	public Pane getRootPane() {
		return rootPane;
	}
	
	public Pane getGridPane() {
		return gridPane;
	}
	
	public void addNumber() {
		for(int a = 0; a < save.getNum();a++) {
			for(int b = 0; b < save.getNum();b++) {
				int gridPointer = (save.getNum()*a)+b;
				Button add = new Button();
				add.setText(Integer.toString(gridPointer));
				gridPane.add(add, b, a);
			}
		}
	}
}
