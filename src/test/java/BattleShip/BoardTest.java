package BattleShip;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	
	/*Test para comprobar que todas las posiciones se han creado correctamente
	 con '-'  */
	@Test
	public void initBoardTest() {
		
		Board board = new Board(5,5,5);
		board.initBoard();

		for (int i = 0; i < board.getRow() ; i++) {
			for (int j = 0; j < board.getCol(); j++) {
				assertEquals('-',board.getPosition(i,j));
			}
		}
	}
	/*
	 * Test para comprobar que los barcos estan dentro de la matriz.
	 * La suma de las longitudes de los barcos es 5.
	 * */
	@Test
	public void setShipTest() {
		
		Board board = new Board(5,5,5);
		board.initBoard();
		board.setShip();
		int counter = 0;
		
		for (int i = 0; i < board.getRow() ; i++) {
			for (int j = 0; j < board.getCol(); j++) {
				if (board.matrix[i][j] == 'S') {
					counter++;
				}
			}
		}
		assertEquals(5, counter);
	}
	/*Test que comprueba que no se queda ningún espacio vacio al printar.
	 Comparamos que todas las posiciones (5*5) tienen un char valido
	 que printar*/
	public void printBoardTest() {
		Board board = new Board(5,5,5);
		board.initBoard();
		int counter = 0;
		board.matrix[1][1]='S';
		board.matrix[3][3]='S';
		board.matrix[2][4]='X';
		board.matrix[1][2]='X';
		board.matrix[3][4]='O';
		board.matrix[2][0]='O';

		for (int i = 0; i < board.getRow() ; i++) {
			for (int j = 0; j < board.getCol(); j++) {
				if (board.matrix[i][j] != ' ') {
					counter++;
				}
			}
		
		assertEquals(25, counter);
	}

}
