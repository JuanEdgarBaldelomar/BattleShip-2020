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
		
		//tc05 quitar las lineas 5 y 6 porque tenemos solo 4 datasets, creo que se tiene que corregir todo el tc para que haya una 
		//con el codigo
		
		//Dataset 1,2
		//Dataset 2,5
		
		
		mockBoard[0][1] = 'S';
		mockBoard[1][4] = 'S';
		
		mockBoard[0][0] = 'S';
		mockBoard[4][4] = 'S';
		mockBoard[0][4] = 'S';
		
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
		mockBoard[2][3] = 'S';
		mockBoard[0][4] = 'S';
		
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

