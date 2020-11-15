package BattleShip;

/**
 * @author Ferran Bayona Castellà - 1390131
 * @author Marcos Alessandro Mena Pérez - 1460748
 * */

/**
 * Mock object de la clase Board.java que simula disparos en 
 * diferentes coordenadas de la matriz para facilitar el testeo.  
 */

public class MockShooter extends Shooter{

	/**
	 * Constructor de la clase MockShooter.java
	 * @param id
	 */
	public MockShooter(int id) {
		super(id);
	}
	
	/**
	 * Simulamos 4 disparos para testear los métodos getCoordinates() y printBoard().
	 * @param board
	 */
	public void modShips1(Board board) {
		
		board.setPosition(0, 0, 'O');
		board.setPosition(3, 4, 'O');
		board.setPosition(1, 1, 'X');
		board.setPosition(2, 2, 'X');

	}
	
	/**
	 * Simulamos 2 disparos para testear el método Shot().
	 * @param board
	 */
	public void modShips2(Board board) {
		
		board.setPosition(1, 1, 'X');
		board.setPosition(3, 3, 'X');

	}
	
	/**
	 * Simulamos 2 disparos para testear el método countShip().
	 * @param board
	 */
	public void modShips3(Board board) {
		
		board.setPosition(3, 1, 'X');
		board.setPosition(2, 3, 'X');

	}
}
