package gmit;

import java.util.Scanner;

/**
 * @author Brian Varley
 *
 */
public class Main implements Commands{

	
	
	public static void main(String[] args)  {
		
		//Boolean to signify game progress 
		boolean gameOver = false;
		
		//Start screen prompt
		System.out.println("********************************GRAIL QUEST************************************");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------");
	    System.out.println("Hit enter to begin your quest to the Kingdom of Cyprus..");
	    new Scanner(System.in).nextLine();
	    
	    //GameParser parser = new GameParser();
		//parser.parse();
	    
	    System.out.println("Testing game graph, created using jgrapht lib");
		//Create a game graph
	    GameGraph graph = new GameGraph();
		
	    System.out.println("Testing game map, created using map exmaple from AI lab");
		//Creating a map
	    GameMap gm = new GameMap();
		Location start = gm.getStartNode();
		start.setVisited(true);
		BeamSearch bf = new BeamSearch();
		bf.search(start);
		
		
		//main game loop
		while (gameOver) {
			
			
			
			
			
			
		}
		
	
		
	}

	//Game player commands:
	@Override
	public String move(String direction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String pickUp(String item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String use(String item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String kill(String gameCharacter) {
		// TODO Auto-generated method stub
		return null;
	}

}
