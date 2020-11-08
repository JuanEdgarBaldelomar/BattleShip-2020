package BattleShip;


public class Board {
	public static int rows = 10;
	public static int columns = 10;
	protected int[][] matrix;
	
	public void initBoard() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = 0;
			}
		}
		
	}
	
	public void shipPosition() {
		
	}


	public Object getPosition(int x, int y) {
		return matrix[x][y];	
	}
	
}