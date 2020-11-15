package BattleShip;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Ferran Bayona Castellà - 1390131
 * @author Marcos Alessandro Mena Pérez - 1460748
 * */


public class GameTest {

	/**
	 * Test que comprueba si ha ganado el jugador o la CPU.
	 * En la consola el turno del player sale con los prints del CPU
	 * para no tener que poner las coordenadas manualmente.
	 */
	@Test
	public void mainTest() {
		Board board = new Board(1,1,1);
		Shooter Player= new Shooter(2);
		Shooter CPU=new Shooter(2);
		boolean winPlayer=false;
		boolean winCPU=false;
		board.initBoard();
		board.setShip();
		
		//PLAYER GANA
		winPlayer=Player.Shot(board,2);
		winCPU = false;
		assertEquals(true,winPlayer);
		assertEquals(false,winCPU);
		//PLAYER PIERDE
		board.initBoard();
		board.setShip();
		winCPU=CPU.Shot(board,2);
		winPlayer = false;
		assertEquals(true,winCPU);
		assertEquals(false,winPlayer);
		
	}

}
