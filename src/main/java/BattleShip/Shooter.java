package BattleShip;

import java.util.Scanner;
import java.util.Random;

/**
 * @author Ferran Bayona Castellà - 1390131
 * @author Marcos Alessandro Mena Pérez - 1460748
 * */


public class Shooter {
	private int x=0;
	private int y=0;
	private int id;
	boolean shooted;
	
	/**
	 * Constructor de la clase Shooter.java
	 * @param id
	 */
	public Shooter(int id) {
		this.id=id;
	}	
	
	/**
	 * Método que llama a getCoordinates para realizar un turno y nos 
	 * retorna un booleano para comprobar si hemos ganado la partida.
	 * @param board
	 * @param id
	 * @return win
	 */
	public boolean Shot(Board board,int id){
		boolean win=false;
				
		getCoordinates(board,id);
		
		if(board.countShip()==0)
		{
			win=true;
		}
		
		return win;
	}
		
	/**
	 * Realiza y controla el turno del Player obteniendo las coordenadas 
	 * por teclado y el turno de la CPU generando coordenadas aleatorias.
	 * Actualiza ambos tableros de juego.
	 * @param board
	 * @param id
	 */
	public void getCoordinates(Board board,int id) {
        
    	if(this.id==1) {
    		do {
    			Scanner scan = new Scanner(System.in);
            	
            	
            	System.out.println("TU TURNO: ");
            	System.out.println("Pon la coordenada x: ");
                if(scan.hasNextInt() ) {x = scan.nextInt();}
                	//scan.nextLine();
                System.out.println("Pon la coordenada y: ");
                if(scan.hasNextInt() ) {y = scan.nextInt();}
                //scan.nextLine();
            	
                if(x>0 && y>0 && x<board.getRow()+1 && y<board.getCol()+1) 
                {
                	x--;
                	y--;
                	if (board.getPosition(x,y) == '-') {
                        board.setPosition(x, y, 'O'); 
                        System.out.println("Has fallado...");
                        shooted=true;
                        board.printBoard();
                    }else if(board.getPosition(x,y) == 'S') {
                    	board.setPosition(x, y, 'X');
                        System.out.println("¡¡Le has dado!!");
                        shooted=true;
                        board.printBoard();
                    }else {
                        System.out.println("Ya has disparado aquí...");
                        shooted=true;
                        board.printBoard();
                    }
                	
                }
                else {
                	System.out.println("Error.Introducir un número del 1 al 5.");
                	shooted=false;
                }
                
    		}while(!shooted);
    		
    	}else if (this.id==2 ) {
    		//TURNO CPU
            System.out.println("TURNO CPU: ");
            Random rand = new Random();
            x = rand.nextInt(board.getRow());
            y = rand.nextInt(board.getCol());
            
            System.out.println("CPU ha disparado en: "+(x+1)+" "+(y+1));
            
            if (board.getPosition(x,y) == '-') {
                board.setPosition(x, y, 'O'); ;
                System.out.println("CPU ha fallado...");
            }else if(board.getPosition(x,y) == 'S') {
            	board.setPosition(x, y, 'X');
                System.out.println("¡¡CPU le ha dado!!");
            }else {
                System.out.println("CPU ya habia disparado aquí...");
            }
           
            board.printBoard();
    		
    	}

    }
	
	/**
	 * Devuelve el ID del jugador. Player o CPU
	 * @return id
	 */
	public int getId() {	
		return this.id;
	}
}
