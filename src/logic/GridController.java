package logic;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import sun.font.CreatedFontTracker;

public class GridController {
	@FXML
	BorderPane pane;

	private List<SaveGrid> numGrid;
	private Table table;
	private RandomNumber random;
	private GridPane mainGrid;
	private GridPane boxGrid;

	@FXML
	public void initialize() {
		table = new Table(3); // 3 or 4
		random = new RandomNumber(table);
		random.run();
		mainGrid = createMainGrid(3);//EmtyGrid

		// something.add(label2, 1, 0);
		// something.add(label3, 6, 6);
		pane.setCenter(mainGrid);
		// for(int i = 0;i < table.getSize();i++) {
		// for(int j = 0;j < table.getSize();j++) {
		// }
		// }
	}
	//Create 3*3
	public GridPane createMainGrid(int num) {
		GridPane gridpane = new GridPane();
		for (int i = 0; i < num; i++) {
			ColumnConstraints column = new ColumnConstraints(225);
			gridpane.getColumnConstraints().add(column);
			RowConstraints rows = new RowConstraints(225);
			gridpane.getRowConstraints().add(rows);
			for (int j = 0; j < num; j++) {
				gridpane.add(createBox(num), j, i);//Create3*3 in side 3*3
			}

		}
		gridpane.setGridLinesVisible(true);
		return gridpane;
	}
	//create box
	public GridPane createBox(int num) {
		boxGrid = new GridPane();
		for (int i = 0; i < num; i++) {
			ColumnConstraints column = new ColumnConstraints(75);
			boxGrid.getColumnConstraints().add(column);
			RowConstraints rows = new RowConstraints(75);
			boxGrid.getRowConstraints().add(rows);

		}
		boxGrid.setGridLinesVisible(true);
		return boxGrid;
	}

	

}
