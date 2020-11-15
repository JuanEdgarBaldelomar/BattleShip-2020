package BattleShip;

/**
 * @author Ferran Bayona Castellà - 1390131
 * @author Marcos Alessandro Mena Pérez - 1460748
 * */

/**
 * Mock object de la clase Board.java que coloca barcos en diferentes 
 * coordenadas de la matriz para facilitar el testeo.  
 */

public class MockBoard extends Board{

	/**
	 * Constructor de la clase MockBoard.java
	 * @param row
	 * @param col
	 * @param nShips
	 */
	public MockBoard(int row, int col, int nShips) {
		super(row, col, nShips);
		
	}

	/**
	 * Inicialización de los barcos para testear el método getCoordinates().
	 * @param board
	 */
	public void inicializarBarcos1(Board board) {
		
		board.setPosition(1, 1, 'S');
		board.setPosition(3, 3, 'S');
		board.setPosition(2, 4, 'S');
		board.setPosition(1, 2, 'S');
		board.setPosition(2, 2, 'S');
	
	}
	
	/**
	 * Inicialización de los barcos para testear los métodos printBoard() y Shot().
	 * @param board
	 */
	public void inicializarBarcos2(Board board) {
		
		board.setPosition(1, 1, 'S');
		board.setPosition(3, 3, 'S');
	}
	
	/**
	 * Inicialización de los barcos para testear el método countShip.
	 * @param board
	 */
	public void inicializarBarcos3(Board board) {
		
		board.setPosition(2, 4, 'S');
		board.setPosition(1, 2, 'S');
		board.setPosition(3, 4, 'S');
		board.setPosition(2, 0, 'S');
		board.setPosition(1, 1, 'S');
		board.setPosition(3, 3, 'S');
		board.setPosition(4, 4, 'S');
		board.setPosition(2, 2, 'S');
		board.setPosition(3, 1, 'S');
		board.setPosition(2, 3, 'S');

	}
	
}
