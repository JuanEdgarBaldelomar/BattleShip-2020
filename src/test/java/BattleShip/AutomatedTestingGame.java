package BattleShip;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;




public class AutomatedTestingGame {
	
	Board gameBoardCPU;
	Board gameBoardUser;
	Board emptyBoard;
	Board boardToTest;
	Board boardBoatsAlive;
	
	Shooter user;
	Shooter cpu;
	
	boolean winUser;
	boolean winCPU;
	
	
	MockBoardTesting mockBoardCPU;
	MockBoardTesting mockBoardUSER;
	ArrayList<String> userComand;
	ArrayList<ArrayList<String>> games;
	
	@Before
	public void setUp() {
		
		
		user = new Shooter(1);
		cpu = new Shooter(2);
		
		boolean saveData = false;
		
		
		gameBoardCPU = new Board(5,5,5);
		gameBoardCPU.initBoard();
		
		boardToTest = new Board(5, 5, 5);
		boardToTest.initBoard();
		
		boardBoatsAlive = new Board(5, 5, 5);
		boardBoatsAlive.initBoard();
		
		
		gameBoardUser = new Board(5, 5, 5);
		gameBoardUser.initBoard();
		gameBoardUser.setShip();
		
		emptyBoard = new Board(5, 5, 5);
		emptyBoard.initBoard();
		emptyBoard.setShip();
		
		mockBoardCPU = new MockBoardTesting();
		mockBoardUSER = new MockBoardTesting();
		
		winCPU =false;
		winUser = false;
		
		games = new ArrayList<ArrayList<String>>();
		//"/Users/juanedgarbaldelomarsalazar/Desktop/UAB/TQS/practicas/P2/BattleShip-2020/partida1.txt"
		BufferedReader bfReader;
		try {
			bfReader = new BufferedReader( new FileReader("../partida1.txt"));
			String line = bfReader.readLine();
			String[] splitedContent;
			String contentToSave;
			userComand = new ArrayList<String>();
			while (line != null) {
				
				
				splitedContent = line.split(",");
				if(splitedContent.length == 4) {
				
					
					if (saveData) {
						games.add(userComand);
						userComand = new ArrayList<String>();
					}else {
						saveData = true;
					}
					
					
					
				}else if(splitedContent.length == 3) {
					contentToSave = splitedContent[0] + "," + splitedContent[1] +"," + splitedContent[2];
					userComand.add(contentToSave);
				}
				else {
					
					contentToSave = splitedContent[0] + "," + splitedContent[1];
					userComand.add(contentToSave);
					
				}
				
				line = bfReader.readLine();
			}
			bfReader.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Test
	public void gameAutomatedTesting() {
		
		//int game = 0;
		
		char[][] table = new char[5][5];
		table = gameBoardCPU.getBoard();
		
		ArrayList<String> gameCommands = new ArrayList<String>(); 
		
		
		//System.out.println(games.get(0));
		//System.out.println(games.get(1));
		
		
		while (games.size() != 0) {
			

			switch (games.size()) {
				case 2: 
					String userGameResult = " ";
					String cpuGameResult = " ";
					gameBoardCPU.setMockBoard(mockBoardCPU.getUserWinsGameOne(table));
					gameCommands = games.get(0);
					Iterator<String> i = gameCommands.iterator();
					
					while(i.hasNext()) {
						String line = i.next();
						String[] data = line.split(",");
						//Integer.parseInt(myString);
						
						if (data.length == 3) {
							int x = Integer.parseInt(data[0]);
							int y = Integer.parseInt(data[1]);
							int nShipsAlive = Integer.parseInt(data[2]);
							
							winUser = user.Shot(gameBoardCPU, 1, x, y);
							assertEquals(nShipsAlive, gameBoardCPU.countShip());
							winCPU = cpu.Shot(gameBoardUser, 2,0 ,0);
							
						}else {
							userGameResult = data[0];
							cpuGameResult = data[1];
						}
					
						
					}
					assertEquals(Boolean.toString(winUser) , userGameResult);
					assertEquals(Boolean.toString(winCPU), cpuGameResult);
					
					
					
					games.remove(0);
					break;
				case 1: 
					String userGameResult1 = " ";
					String cpuGameResult1 = " ";
					System.out.println("GAME2");
					System.out.println();
					gameBoardUser.setMockBoard(mockBoardUSER.getMockBoardCpuWin(table));
					
					gameCommands = games.get(0);
					Iterator<String> i2 = gameCommands.iterator();
					
					while (i2.hasNext()) {
						String line = i2.next();
						String[] data = line.split(",");
						
						
						if (data.length == 3) {
							
							int x = Integer.parseInt(data[0]);
							int y = Integer.parseInt(data[1]);
							int nShipsAlive = Integer.parseInt(data[2]);
							winCPU = cpu.Shot(gameBoardUser, 2,x ,y);
							assertEquals(nShipsAlive, gameBoardUser.countShip());
							winUser = user.Shot(emptyBoard, 1,x,y);
							
						}else {
							userGameResult1 = data[0];
							cpuGameResult1 = data[1];
						}
						
					}
					assertEquals(Boolean.toString(winUser) , userGameResult1);
					assertEquals(Boolean.toString(winCPU), cpuGameResult1);
					
					
					games.remove(0);
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: ");
			}
			
		}
				
		
	}
	
	@Test
	public void boatsAlive()  {
		
		char [][] table = new char[5][5];
		table = boardToTest.getBoard();
		
		boardToTest.setMockBoard(mockBoardCPU.getMockBoardBoatsAliveCpu(table));
		ArrayList<Integer> nShips = new ArrayList<Integer>();
		
		
		try {
			
			BufferedReader reader = new BufferedReader( new FileReader("../barcosCpuVivos.txt"));
			String line = reader.readLine();
			while(line != null) {
				
				nShips.add(Integer.parseInt(line));	
				line = reader.readLine();
			}
		
			reader.close();
		}catch (IOException e ) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		Iterator<Integer> it = nShips.iterator();
		int x = 4;
		while(it.hasNext()) {
			Integer ships = it.next();
			int nBoats = ships.intValue();
			boolean winUser = user.Shot(boardToTest, 1, x, 1);
			assertEquals(nBoats, boardToTest.countShip());
			x--;
		}
		
	}
	
	@Test
	public void boatsAliveforUser()  {
		
		
		char [][] table = new char[5][5];
		table = boardToTest.getBoard();
		
		
		boardBoatsAlive.setMockBoard(mockBoardCPU.getMockCountBoatsAliveUser(table));
		
		ArrayList<Integer> nShips = new ArrayList<Integer>();
		
		
		try {
			
			BufferedReader reader = new BufferedReader( new FileReader("../barcosCpuVivos.txt"));
			String line = reader.readLine();
			while(line != null) {
				
				nShips.add(Integer.parseInt(line));	
				line = reader.readLine();
			}
		
			reader.close();
		}catch (IOException e ) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		Iterator<Integer> it = nShips.iterator();
		int Coordx = 4;
		while(it.hasNext()) {
			Integer ships = it.next();
			int nBoats = ships.intValue();
			boolean winComputer = cpu.Shot(boardBoatsAlive, 2, Coordx, 0);
			assertEquals(nBoats, boardBoatsAlive.countShip());
			Coordx--;
		}
		
	}
	

}

