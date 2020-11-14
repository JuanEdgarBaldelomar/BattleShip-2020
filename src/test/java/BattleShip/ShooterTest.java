package BattleShip;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShooterTest {

	@Test
	public void Shot(){
		Board board = new Board(5,5,5);
		board.initBoard();
		int n_ship;
		//Board amb 2 Ship
		board.matrix[1][1]='S';
		board.matrix[3][3]='S';
		n_ship=board.countShip();
		assertTrue(n_ship==0);
		//Board amb 0 Ship
		n_ship=board.countShip();
		assertTrue(n_ship==0);
	}
	
	
	@Test
	void getCoordinatesTest() {
		int countO=0,countX=0,countS=0;
		
	
		Board board = new Board(5,5,5);
		board.initBoard();
		//setShip
		board.matrix[1][1]='S';
		board.matrix[3][3]='S';
		board.matrix[2][4]='S';
		board.matrix[1][2]='S';
		board.matrix[2][2]='S';
		
		//Turno
		board.matrix[0][0] ='O';
		board.matrix[3][4] ='O';
		board.matrix[1][1] ='X';
		board.matrix[2][2] ='X';
		
		for (int i = 0; i < board.getRow() ; i++) {
			for (int j = 0; j < board.getCol(); j++) {
				if(board.matrix[i][j]=='O') {
					countO++;
				}else if(board.matrix[i][j]=='X'){
					countX++;
				}else if(board.matrix[i][j]=='S'){
					countS++;
				}
			}
		}
		assertEquals(2, countO);
		assertEquals(2, countX);
		assertEquals(3, countS);
	}
	@Test
	public void getId() {
		Shooter Player=new Shooter(3);
		assertEquals(3, Player.getId());
	}

}
