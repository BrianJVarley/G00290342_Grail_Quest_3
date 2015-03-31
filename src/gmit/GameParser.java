package gmit;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GameParser {
	
	
		private static final String GAME_FILE = "/resources/game.json";
		
		URL sourceURL = getClass().getResource(GAME_FILE); 

		public void parse() throws IOException, URISyntaxException {
				        
			
			
			ObjectMapper mapper = new ObjectMapper();
		    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

			 
			try {
					
				// read from file, convert it to Location class
				Location loc = mapper.readValue(new File(sourceURL.toURI()), Location.class);
				Item item = mapper.readValue(new File(sourceURL.toURI()), Item.class);

		 
				// display to console
				System.out.println(loc.toString());
				System.out.println(item.toString());
		 
			} catch (JsonGenerationException e) {
		 
				e.printStackTrace();
		 
			} catch (JsonMappingException e) {
		 
				e.printStackTrace();
		 
			} catch (IOException e) {
		 
				e.printStackTrace();
		 
			}
			
			
			
		}


}
