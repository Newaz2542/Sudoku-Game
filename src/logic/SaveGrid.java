package logic;

import java.util.List;

public enum SaveGrid {
	ZERO(0,0),ONE(1,0),TWO(2,0),THREE(0,1),FOUR(1,1),FIVE(1,2),SIX(0,2),SEVEN(1,2),EIGHT(2,2);
	
	private final int column;
	private final int row;
	
	private SaveGrid(int column,int row) {
		this.column = column;
		this.row = row;
	}
	
	public int getNumberGrid(int n , int m) {
		if(this.getClass().equals(ZERO)) {
			return 0;
		}
		else if(this.getClass().equals(ONE)) {
			return 1;
		}
		else if(this.getClass().equals(TWO)) {
			return 2;
		}
		else if(this.getClass().equals(THREE)) {
			return 3;
		}
		else if(this.getClass().equals(FOUR)) {
			return 4;
		}
		else if(this.getClass().equals(FIVE)) {
			return 5;
		}
		else if(this.getClass().equals(SIX)) {
			return 6;
		}
		else if(this.getClass().equals(SEVEN)) {
			return 7;
		}
		else if(this.getClass().equals(EIGHT)) {
			return 8;
		}
		else {
			return -1;
		}
	}
	
	public int getColumn() {
		return column;
	}
	
	public int getRow() {
		return row;
	}
}
