package BattleShip;

import java.util.Random;

public class Board {
	public int nShips;
	private int row;
	private int col;
	protected char[][] matrix = new char[5][5];
	
	public Board(int row,int col,int nShips)
	{
		this.row=row;
		this.col=col;
		this.nShips=nShips;
	
	}
	public void initBoard() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = '-';
			}
		}
		
	}
	
	public void setShip() {
		int x,y=0;
        Random rand = new Random();
        int cont = 0;

        while (cont < nShips) {
            x = rand.nextInt(row);
            y = rand.nextInt(col);
            if (matrix[x][y] == '-') {
                matrix[x][y] = 'S';
                cont++;
            }
        }
	}
	public void printBoard(){
		for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix.length; j++) {
            	if(this.matrix[i][j]!='S') {
            		System.out.print(this.matrix[i][j]+" ");
            	}else {
            		System.out.print('-'+" ");
            	} 
            }
            System.out.println();
        }
		
	}
	public int countShip() {
		//Contar Ships Restantes
		return 0;
	}
	
		
	public int getRow() {
		
		return this.row;
	}

	public int getCol() {
	
		return this.col;
	}	

	public int getPosition(int x, int y) {
		return matrix[x][y];	
	}
	
}