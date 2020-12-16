package BattleShip;

import java.util.Random;

/**
 * @author Ferran Bayona Castell� - 1390131
 * @author Marcos Alessandro Mena P�rez - 1460748
 * */


public class Board {
	public int nShips;
	private int row;
	private int col;
	protected char[][] matrix = new char[5][5];

	/**
	 * Constructor de la clase Board
	 * @param row
	 * @param col
	 * @param nShips
	 */
	public Board(int row,int col,int nShips){
		this.row=row;
		this.col=col;
		this.nShips=nShips;
	}
	
	public void setMockBoard(char[][] mockBoard) {
		matrix = mockBoard;
	}
	
	public char[][] getBoard(){
		
		return this.matrix;
		
	}
	
	/**
	 * Inicializa la matriz de juego con '-' en todas las posiciones.
	 */
	public void initBoard() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = '-';
			}
		}
		
	}
	
	/**
	 * Colocamos n barcos de forma aleatoria por la matriz de juego.
	 * Cambiamos el valor '-' por 'S'.
	 */
	public void setShip() {
		int x,y=0;
        Random rand = new Random();
        int cont = 0;

        while (cont < getNShip()) {
            x = rand.nextInt(this.getRow());
            y = rand.nextInt(this.getCol());
            if (this.getPosition(x, y) == '-') {
            	this.setPosition(x, y, 'S');
                cont++;
            }
        }
	}
	
	/**
	 * Imprimimos por pantalla la matriz de juego ocultando los barcos
	 * que se muestren en la matriz de juego.
	 */
	public void printBoard(){
		System.out.print("  ");
		for (int c = 0; c < this.getRow(); c++) {
			System.out.print((c+1)+" ");
		}
		System.out.println();
		for (int i = 0; i < this.getRow(); i++) {
			System.out.print((i+1) + " ");
            for (int j = 0; j < this.getCol(); j++) {
            	if(this.getPosition(i, j) !='S') {
            		System.out.print(this.getPosition(i, j)+" ");
            	}else {
            		System.out.print('-'+" ");
            	} 
            }
            System.out.println();
        }
		
	}
	
	/**
	 * Contamos el n�mero de barcos restantes en la matriz de juego
	 * y devolvemos el valor.
	 * @return count
	 */
	public int countShip() {
		int count=0;
		for (int i = 0; i < this.getRow(); i++) {
            for (int j = 0; j < this.getCol(); j++) {
                if(this.getPosition(i, j)=='S') {count++;}
            }
        }
		return count;
	}
	
	/**
	 * Devuelve el n�mero de barcos de la matriz de juego.
	 * @return nShips
	 */
	public int getNShip() {
		return nShips;
	}
	
	/**
	 * Devuelve el n�mero de filas de la matriz de juego.
	 * @return row
	 */
	public int getRow() {
		return this.row;
	}
	
	/**
	 * Devuelve el n�mero de columnas de la matriz de juego.
	 * @return col
	 */
	public int getCol() {
		return this.col;
	}
	
	/**
	 * Devuelve el n�mero de filas de la matriz de juego.
	 * @param x
	 * @param y
	 * @return valor de la coordenada de la matriz de juego.
	 */
	public char getPosition(int x, int y) {
		return matrix[x][y];	
	}
	
	/**
	 * Inserta un valor en la coordenada de la matriz de juego.
	 * @param x
	 * @param y
	 * @param c
	 */
	public void setPosition(int x, int y,char c) {
		matrix[x][y]=c;
	}
	
}