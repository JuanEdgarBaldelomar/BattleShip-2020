package BattleShip;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {

	@Test
	public void test() {
		Board board = new Board(1,1,1);
		Shooter Player= new Shooter(1);
		Shooter CPU=new Shooter(2);
		boolean winPlayer=false;
		boolean winCPU=false;
		board.initBoard();
		
		//PLAYER GANA
		winPlayer=Player.Shot(board,1);
		assertEquals(true,winPlayer);
		assertEquals(false,winCPU);
		//PLAYER PIERDE
		winCPU=CPU.Shot(board,2);
		assertEquals(true,winCPU);
		assertEquals(false,winPlayer);
		
	}

}
