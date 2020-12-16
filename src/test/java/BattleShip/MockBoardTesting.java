package BattleShip;

/**
 * 
 * @author Juan Edgar Baldelomar Salazar
 * @author Javier Ledesma Pardo
 */


public class MockBoardTesting {

	
	
	
	public char[][] getMockBoardUserWin(char[][] board) {
		
		char [][] mockBoard = new char[5][5];

		mockBoard = board;
		
		mockBoard[4][3] = 'S';
		
		
		return mockBoard;
		
	}
	
	public char[][] getMockOneBoatAlive(char[][] board){
		
		
		char[][] mockBoard = new char[5][5];
		mockBoard = board;
		
		
		mockBoard[0][0] = 'S';
		mockBoard[2][2] = 'S';
		
	
		return mockBoard;
		
	
	}
	
	
	public char[][] getMockCountBoatsAliveUser(char[][] board){
		
		char[][] mockBoard = new char[5][5];
		mockBoard = board;
		
		mockBoard[4][0] = 'S';
		mockBoard[3][0] = 'S';
		mockBoard[2][0] = 'S';
		mockBoard[1][0] = 'S';
		mockBoard[0][0] = 'S';
		
		return mockBoard;
	}
	
	
	public char[][] getMockBoardCpuWin(char [][]board){
		
		char[][] mockBoard = new char[5][5];
		mockBoard = board;
		
		mockBoard[1][2] = 'S';
		
		return mockBoard;
		
	}
	
	
	public char[][] getMockBoardBoatsAliveCpu(char [][] board){
		
		
		char[][] mockBoard = new char[5][5];
		mockBoard = board;
		
		mockBoard[4][0] = 'S';
		mockBoard[3][0] = 'S';
		mockBoard[2][0] = 'S';
		mockBoard[1][0] = 'S';
		mockBoard[0][0] = 'S';
		
		return mockBoard;
		
	}
	
	
	public char[][] getUserWinsGameOne(char [][] board){
		
		char [][] mockBoard = new char[5][5];
		mockBoard = board;
		
		mockBoard  [0][0] = 'S';
		mockBoard  [4][0] = 'S';
		mockBoard  [0][4] = 'S';
		mockBoard  [4][4] = 'S';
		mockBoard  [2][2] = 'S';
		return mockBoard;
		
		
	}
	
	
	
}

