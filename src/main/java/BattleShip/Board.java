package BattleShip;

import java.util.Random;

public class Board {
	public static int rows = 10;
	public static int columns = 10;
	public static int nShips = 5;
	protected int[][] matrix;
	protected int x;
	protected int y;
	protected int orientation;
	
	
	public void initBoard() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = 0;
			}
		}
		
	}
	
	public void shipPosition() {
		
		Random rand = new Random();
		
		int[] shipsLeft = {1, 2, 2};
		
		for (int k = 0; k <= nShips; k++) {
			
			orientation = rand.nextInt(2);
			
			if(orientation==0) { // vertical (descendiente)
				
				x = rand.nextInt(10);
				
				for (int i = x; i < rows - x; i++) {
					
					y = rand.nextInt(7);
					
					for (int j = y; j < columns - y; j++) {
						
						if(getPosition(x, y) == 0 && getPosition(i, j + 1) == 0 && getPosition(i, j + 2) == 0 && getPosition(i ,j + 3) == 0) {
							
							for (int l = 0; l < 3; l++) {
								
								if (shipsLeft[l] > 0) {
									if (l == 0) {
										for (int m = j; m < j + 3; m++) {
											matrix[i][m] = 1;
										}
									}else if (l == 1){
										for (int m = j; m < j + 2; m++) {
											matrix[i][m] = 1;
										}
									}else{
										for (int m = j; m < j + 1; m++) {
											matrix[i][m] = 1;
										}
									}
									shipsLeft[l]--;
								}
							}
						} 
					}
				}
				
			}else { // horizontal (hacia la derecha)
				
				x = rand.nextInt(10);
				
				for (int i = x; i < rows - x; i++) {
					
					y = rand.nextInt(7);
					
					for (int j = y; j < columns - y; j++) {
						
						if(getPosition(x, y) == 0 && getPosition(i, j + 1) == 0 && getPosition(i, j + 2) == 0 && getPosition(i ,j + 3) == 0) {
							
							for (int l = 0; l < 3; l++) {
								
								if (shipsLeft[l] > 0) {
									if (l == 0) {
										for (int m = j; m < j + 3; m++) {
											matrix[i][m] = 1;
										}
									}else if (l == 1){
										for (int m = j; m < j + 2; m++) {
											matrix[i][m] = 1;
										}
									}else{
										for (int m = j; m < j + 1; m++) {
											matrix[i][m] = 1;
										}
									}
									shipsLeft[l]--;
								}
							}
						} 
					}
				}
			}
		}
		
		
	}


	public int getPosition(int x, int y) {
		return matrix[x][y];	
	}
	
}