package BattleShip;

/**
 * @author Ferran Bayona Castellà - 1390131
 * @author Marcos Alessandro Mena Pérez - 1460748
 * */


public class Game {
	
	/**
	 * Método donde se ejecuta el juego.
	 * Muestra por pantalla si hemos ganado o perdido la partida.
	 * @param args
	 */
	public static void main(String[] args){
		boolean winPlayer=false;
		boolean winCPU=false;
		
		Board board = new Board(5,5,5);
		Board boardCPU = new Board(5,5,5);
		Shooter Player= new Shooter(1);
		Shooter CPU=new Shooter(2);
		board.initBoard();
		board.setShip();
		boardCPU.initBoard();
		boardCPU.setShip();
		
		board.printBoard();
		System.out.println("-------------");
		boardCPU.printBoard();

		while(!winPlayer && !winCPU){
				
			winPlayer=Player.Shot(board,Player.getId());

			winCPU=CPU.Shot(boardCPU,CPU.getId());
		}
		if(winPlayer){
			System.out.print("HAS GANADO");
		}else 
			System.out.print("HAS PERDIDO");
		}
}
