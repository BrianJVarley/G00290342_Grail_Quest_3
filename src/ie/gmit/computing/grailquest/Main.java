package ie.gmit.computing.grailquest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Brian Varley
 *
 */
public class Main {

	public static void main(String[] args) {

		// Boolean to signify game state
		boolean gameNotOver = true;

		Location nextLocation = new Location();
		Location startNode = new Location();

		Iterator<Location> nodeIterator = startNode.iterator();

		// Array list used to store items picked up during game play
		ArrayList<String> inventory = new ArrayList<String>();

		// Array list used to store players
		ArrayList<Saracen> saracens = new ArrayList<Saracen>();
		ArrayList<Knight> knights = new ArrayList<Knight>();

		// Start screen prompt
		System.out
				.println("********************************GRAIL QUEST************************************");
		System.out
				.println("-------------------------------------------------------------------------------");
		System.out
				.println("-------------------------------------------------------------------------------");
		System.out.println("Game Controls:");
		System.out.println("*Move");
		System.out.println("*Use");
		System.out.println("*Look");
		System.out.println("*Get");
		System.out.println("*Attack");
		System.out.println("*Search");
		System.out.println("*Inventory");
		System.out.println("");
		System.out
				.println("Hit enter to begin your quest to the Kingdom of Cyprus..");
		new Scanner(System.in).nextLine();

		// The parser() works but having issues with
		// the resource not being found, when deployed as a jar.
		// GameParser parser = new GameParser();
		// parser.parse();

		System.out.println("Testing game graph, created using jgrapht lib");
		// Create a game graph
		GameGraph graph = new GameGraph();

		System.out
				.println("Testing game map, created using map example from AI lab");

		// Add Saracen and Knight players
		Saracen saracenObj = new Saracen();
		Knight knightObj = new Knight();

		for (int i = 0; i < 17; i++) {
			saracenObj.setName("Jim");
			knightObj.setName("John");
			// add objects to the player array lists
			saracens.add(saracenObj);
			knights.add(knightObj);
		}

		// Creating game map
		GameMap playerMap = new GameMap();
		startNode = playerMap.getStartNode();
		inventory.add("Holy Grail");

		// main game loop
		while (gameNotOver) {

			// Take in user commands here
			// and parse commands
			String input = Input.getInput();
			if (input.equals("description")) {
				System.out.println("Description: ");
			} else if (input.equals("look")) {
				System.out.println(startNode.toString());
			} else if (input.equals("move")) {
				System.out.println("Moving.. ");
				startNode = startNode.next();
				System.out.println(startNode.toString());
			} else if (input.equals("get")) {
				System.out.println("Picking up item");
				if (startNode.getItem() != null) {
					inventory.add(startNode.getItem().toString());
					System.out.println("Item added to inventory: "
							+ startNode.getItem().toString());
				}

			} else if (input.equals("use")) {

				System.out.println("using item");

			} else if (input.equals("attack")) {

				System.out.println("attacking..");

			} else if (input.equals("inventory")) {

				System.out.println("checking inventory..");
				System.out.println(inventory.toString());

			} else if (input.equals("search")) {

				System.out.println("searching game map route..");
				startNode.setVisited(true);
				BeamSearch beamSearch = new BeamSearch();
				beamSearch.search(startNode);

			} else if (input.equals("quit")) {
				System.out.println("Goodbye!");
				gameNotOver = false;
			}
			// Invalid input check
			else {
				System.out.println("Invalid command, try again!");
			}

		}

		// Game over
		System.out.println("Game Over!");
		System.exit(0);
	}

}
