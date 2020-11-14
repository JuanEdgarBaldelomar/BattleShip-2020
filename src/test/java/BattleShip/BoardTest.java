package BattleShip;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	
	
	@Test
	public void initBoardTest() {
		
		Board board = new Board(5,5,5);
		board.initBoard();

		for (int i = 0; i < board.getRow() ; i++) {
			for (int j = 0; j < board.getCol(); j++) {
				assertEquals('-',board.getPosition(i,j));
			}
		}
	}
	/*
	 * Test para comprobar que los barcos estan dentro de la matriz.
	 * La suma de las longitudes de los barcos es 5.
	 * */
	@Test
	public void shipPositionTest() {
		
		Board board = new Board(5,5,5);
		board.initBoard();
		board.setShip();
		int counter = 0;
		
		for (int i = 0; i < board.getRow() ; i++) {
			for (int j = 0; j < board.getCol(); j++) {
				if (board.matrix[i][j] == 'S') {
					counter++;
				}
			}
		}
		assertEquals(5, counter);
	}

}
