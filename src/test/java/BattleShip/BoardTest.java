package BattleShip;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	/*
	 * Test para comprobar que todas las posiciones se han creado correctamente con '-'.
	 */
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
	/*
	 * Test que comprueba que no se queda ningún espacio vacio al printar.
	 Comparamos que todas las posiciones (5*5) tienen un char valido
	 que printar
	 */
	@Test
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

		for (int i = 0; i < board.getRow(); i++) {
			for (int j = 0; j < board.getCol(); j++) {
				if (board.matrix[i][j] != ' ') {
					counter++;
					System.out.println(counter);
				}
			}
		}
		System.out.println(counter);
		assertEquals(25, counter);	
	}
	/*
	 * Test que comprueba el número de barcos restantes que inicializamos
	 * */
	@Test
	public void countShipTest() {
		Board board = new Board(5,5,10);
		board.initBoard();
		board.matrix[2][4]='S';
		board.matrix[1][2]='S';
		board.matrix[3][4]='S';
		board.matrix[2][0]='S';
		board.matrix[1][1]='S';
		board.matrix[3][3]='S';
		board.matrix[4][4]='S';
		board.matrix[2][2]='S';
		board.matrix[3][1]='S';
		board.matrix[2][3]='S';
		int counter = 0;
		for (int i = 0; i < board.getRow() ; i++) {
			for (int j = 0; j < board.getCol(); j++) {
				if (board.matrix[i][j] == 'S') {
					counter++;
				}
			}
		}
		assertEquals(10, counter);
		
		//Situación de hundimiento de 2 barcos
		
		board.matrix[3][1]='X';
		board.matrix[2][3]='X';
		
		counter=0;
		
		for (int i = 0; i < board.getRow() ; i++) {
			for (int j = 0; j < board.getCol(); j++) {
				if (board.matrix[i][j] == 'S') {
					counter++;
				}
			}
		}
		assertEquals(8, counter);
	}
	
	/*
	 * Test que comprueba el getter de número de barcos.
	 * */
	@Test
	public void getNShipTest() {
		Board board = new Board(5,5,10);
		assertEquals(10, board.getNShip());

	}
	
	/*
	 * Test que comprueba el getter de las filas.
	 * */
	@Test	
	public void getRowTest() {
		Board board = new Board(7,5,6);
		assertEquals(7, board.getRow());
	}
	
	/*
	 * Test que comprueba el getter de las columnas.
	 * */
	@Test
	public void getColTest() {
		Board board = new Board(5,4,2);
		assertEquals(4, board.getCol());
	}	
	
	/*
	 * Test que comprueba el getter de las coordenadas.
	 * */
	@Test
	public void getPositionTest() {
		Board board = new Board(5,5,5);
		board.matrix[1][1]='X';
		assertEquals('X', board.getPosition(1,1));
		
	}
	
	/*
	 * Test que comprueba el setter de las coordenadas.
	 * */
	@Test
	public void setPositionTest() {
		Board board = new Board(5,5,5);
		board.matrix[1][3]='S';
		assertEquals('S', board.getPosition(1,3));
		board.setPosition(1, 3, 'X');
		assertEquals('X', board.getPosition(1,3));
	}
}
