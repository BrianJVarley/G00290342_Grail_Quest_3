package gmit;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) throws IOException, URISyntaxException {
		
		
		GameParser parser = new GameParser();
		parser.parse();
			
			
		//Start screen prompt
		System.out.println("********************************GRAIL QUEST************************************");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------");
	    System.out.println("Hit enter to begin your quest to the Kingdom of Cyprus..");
	    new Scanner(System.in).nextLine();
	    System.out.println(".....");
		
		}

}
