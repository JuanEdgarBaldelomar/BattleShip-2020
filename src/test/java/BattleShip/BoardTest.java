package BattleShip;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	public static int rows = 10;
	public static int columns = 10;
	
	@Test
	public void initBoardTest() {
		
		Board board = new Board();
		board.initboard();

		for (int i = 0; i < rows ; i++) {
			for (int j = 0; j < columns; j++) {
				assertEquals(0,board.getPosition(i,j));
			}
		}
	}

}
