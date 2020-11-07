package BattleShip;

import java.util.ArrayList;
import java.util.Arrays;


public class Board {
	public static int rows = 10;
	public static int columns = 10;
	public static int[][] board;
	
	public void initboard() {
		
		
	}


	public Object getPosition(int x, int y) {
		
		return board[x][y];
		
	}
	
}