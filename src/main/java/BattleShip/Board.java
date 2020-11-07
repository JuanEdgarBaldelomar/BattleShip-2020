package BattleShip;

import java.util.ArrayList;
import java.util.Arrays;


public class Board {
	public static int rows = 10;
	public static int columns = 10;
	public static int[][] board;
	
	public void initBoard() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				board[i][j] = 0;
			}
		}
		
	}


	public Object getPosition(int x, int y) {
		
		return board[x][y];
		
	}
	
}