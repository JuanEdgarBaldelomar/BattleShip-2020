package BattleShip;

public class MockBoard extends Board{

	public MockBoard(int row, int col, int nShips) {
		super(row, col, nShips);
		
	}

	public void inicializarBarcos1(Board board) {
		
		board.setPosition(1, 1, 'S');
		board.setPosition(3, 3, 'S');
		board.setPosition(2, 4, 'S');
		board.setPosition(1, 2, 'S');
		board.setPosition(2, 2, 'S');
	
	}
	
	public void inicializarBarcos2(Board board) {
		
		board.setPosition(1, 1, 'S');
		board.setPosition(3, 3, 'S');
	}
	
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
