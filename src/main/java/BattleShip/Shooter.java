package BattleShip;

import java.util.Scanner;
import java.util.Random;

public class Shooter {
	private int x;
	private int y;
	private int id;
	boolean shooted;
	
		
		/*Controla El turno del Player y CPU, obteniendo coordenadas
		por teclado y random y actualiza el board*/
		
	
public void getCoordinates(Board board,int id) {
        
    	if(this.id==1) {
    		do {
    			Scanner scan = new Scanner(System.in);
            	int x=0,y=0;
            	
            		System.out.println("Enter coordinate x: ");
                	if(scan.hasNextInt() ) {x = scan.nextInt();}
                	//scan.nextLine();
                	
                	System.out.println("Enter coordinate y: ");
                    if(scan.hasNextInt() ) {y = scan.nextInt();}
                   
                    //scan.nextLine();
            	
                if(x>0 && y>0 && x<board.getRow()+1 && y<board.getCol()+1) 
                {
                	x--;
                	y--;
                	if (board.getPosition(x,y) == '-') {
                        board.setPosition(x, y, 'O'); 
                        System.out.println("Miss...");
                        shooted=true;
                    }else if(board.getPosition(x,y) == 'S') {
                    	board.setPosition(x, y, 'X');
                        System.out.println("¡¡YOU HIT!!");
                        shooted=true;
                    }else {
                        System.out.println("You have already shot here...");
                        shooted=true;
                    }
                	
                }
                else {
                	System.out.println("Error.Coordenades fora de la matriu.");
                	shooted=false;
                }
                board.printBoard();
    		}while(!shooted);
    		
    	}else if (this.id==2 ) {
    		//TORN CPU
            System.out.println("JUGADA DE LA CPU: ");
            Random rand = new Random();
            x = rand.nextInt(board.getRow());
            y = rand.nextInt(board.getCol());
            System.out.println(x);
            System.out.println(y);
            if (board.getPosition(x,y) == '-') {
                board.setPosition(x, y, 'O'); ;
                System.out.println("CPU Miss...");
            }else if(board.getPosition(x,y) == 'S') {
            	board.setPosition(x, y, 'X');
                System.out.println("¡¡CPU HIT!!");
            }else {
                System.out.println("CPU have already shot here...");
            }
           
            board.printBoard();
    		
    	}

    }
	public int getId() {
		
		return this.id;
	}
}
