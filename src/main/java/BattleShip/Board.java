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

        while (cont < getNShip()) {
            x = rand.nextInt(this.getRow());
            y = rand.nextInt(this.getCol());
            if (this.getPosition(x, y) == '-') {
            	this.setPosition(x, y, 'S');
                cont++;
            }
        }
	}
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
	public int countShip() {
		int count=0;
		for (int i = 0; i < this.getRow(); i++) {
            for (int j = 0; j < this.getCol(); j++) {
                if(this.getPosition(i, j)=='S') {count++;}
            }
        }
		return count;
	}
	public int getNShip() {
		return nShips;
	}
	
		
	public int getRow() {
		
		return this.row;
	}

	public int getCol() {
	
		return this.col;
	}	

	public char getPosition(int x, int y) {
		return matrix[x][y];	
	}
	public void setPosition(int x, int y,char c) {
		matrix[x][y]=c;
	}
	
}