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
		}s
		
	}
	
	public void shipPosition() {
		
		Random rand = new Random();
		
		int[] shipsLeft = {1, 2, 2};
		
		
		for (int k = 0; k <= nShips; k++) {
			
			orientation = rand.nextInt(2);
			
			if(orientation==0) { // vertical (descendiente)
				
				x = rand.nextInt(10);
				
				for (int i = x; i < columns - x; i++) {
					
					y = rand.nextInt(7);
					
					for (int j = y; j < rows - y; j++) {
						
						if(getPosition(i, j) == 0 && getPosition(i, j + 1) == 0 && getPosition(i, j + 2) == 0 && getPosition(i ,j + 3) == 0) {
							boolean ship_placed=false;
							for (int l = 0; l < 3; l++) {
								
								if(!ship_placed) 
								{
									if (shipsLeft[l] > 0) 
									{
										if (l == 0) {
											for (int m = j; m < j + 3; m++) {
												matrix[i][m] = 1;
												ship_placed=true;
											}
										}else if (l == 1){
											for (int m = j; m < j + 2; m++) {
												matrix[i][m] = 1;
												ship_placed=true;
											}
										}else{
											for (int m = j; m < j + 1; m++) {
												matrix[i][m] = 1;
												ship_placed=true;
											}
										}
										shipsLeft[l]--;
									}
								}
							}
						} 
					}
				}
				
			}else { // horizontal (hacia la derecha)
				
				y = rand.nextInt(10);
				
				for (int i = y; i <  rows - y; i++) {
					
					x = rand.nextInt(7);
					
					for (int j = x; j <  columns- x; j++) {
						
						if(getPosition(j, i) == 0 && getPosition(j + 1,i ) == 0 && getPosition(j + 2,i ) == 0 && getPosition(j + 3 ,i) == 0) {
							boolean ship_placed=false;
							for (int l = 0; l < 3; l++) {
								if(!ship_placed) 
								{
								if (shipsLeft[l] > 0) {
									if (l == 0) {
										for (int m = j; m < j + 3; m++) {
											matrix[m][i] = 1;
											ship_placed=true;
										}
									}else if (l == 1){
										for (int m = j; m < j + 2; m++) {
											matrix[m][i] = 1;
											ship_placed=true;
										}
									}else{
										for (int m = j; m < j + 1; m++) {
											matrix[m][i] = 1;
											ship_placed=true;
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
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j]+" ");;
			}
		}
	}


	public int getPosition(int x, int y) {
		return matrix[x][y];	
	}
	
}