package gmit;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

import org.antlr.stringtemplate.language.NewlineRef;

public class Main {

	
	/**
	 * @param args
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	public static void main(String[] args) throws IOException, URISyntaxException {
				
		
		//Start screen prompt
		System.out.println("********************************GRAIL QUEST************************************");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------");
	    System.out.println("Hit enter to begin your quest to the Kingdom of Cyprus..");
	    new Scanner(System.in).nextLine();
	    
	    GameParser parser = new GameParser();
		parser.parse();
			
		
		
	}

}
