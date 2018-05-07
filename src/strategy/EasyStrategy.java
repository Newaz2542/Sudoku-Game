package strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import logic.GridManager;
import logic.RandomNumber;
import logic.Table;

public class EasyStrategy extends ModeFactory {

	private List<GridManager> list;
	private Table table;
	private Random rand;

	public EasyStrategy(Table table) {
		this.table = table;
//		this.table = table; // 3 or 4
//		random = new RandomNumber(table);
//		random.run(); // list
		list = new ArrayList<>();
		rand = new Random();
	}

	
	@Override
	public void setPuzzle() {
		list.addAll(table.getList());
	}

	@Override
	public void randomInvisible() {
		for (int j = 0; j < 9; j++) {
			for (int i = 0; i < 9; i++) {
				int x = rand.nextInt(100);
				if (x <= 80) {
					table.getList().get(j).getList().get(i).setLock(true);
				} else {
//					list.get(j).getList().get(i).setLock(false);
					table.getList().get(j).getList().get(i).setLock(false);
				}
			}
		}
	}


	@Override
	public List<GridManager> getPuzzle() {
		return list;
	}

}
