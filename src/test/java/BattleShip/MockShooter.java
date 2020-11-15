package BattleShip;

public class MockShooter extends Shooter{

	public MockShooter(int id) {
		super(id);
	}
	
	public void modShips1(Board board) {
		
		board.setPosition(0, 0, 'O');
		board.setPosition(3, 4, 'O');
		board.setPosition(1, 1, 'X');
		board.setPosition(2, 2, 'X');

	}
	
	public void modShips2(Board board) {
		
		board.setPosition(1, 1, 'X');
		board.setPosition(3, 3, 'X');

	}
	
	public void modShips3(Board board) {
		
		board.setPosition(3, 1, 'X');
		board.setPosition(2, 3, 'X');

	}
}
