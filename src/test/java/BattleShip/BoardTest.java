package BattleShip;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	public static int rows = 10;
	public static int columns = 10;
	
	@Test
	public void initBoardTest() {
		
		Board board = new Board();
		board.initBoard();

		for (int i = 0; i < rows ; i++) {
			for (int j = 0; j < columns; j++) {
				assertEquals(0,board.getPosition(i,j));
			}
		}
	}
	/*
	 * Test para comprobar que los barcos estan dentro de la matriz.
	 * La suma de las longitudes de los barcos es 14.
	 * */
	@Test
	public void shipPositionTest() {
		
		Board board = new Board();
		board.initBoard();
		board.shipPosition();
		int counter = 0;
		
		for (int i = 0; i < rows ; i++) {
			for (int j = 0; j < columns; j++) {
				if (board.matrix[i][j] == '!') {
					counter++;
				}
			}
		}
		assertEquals(14, counter);
	}

}
