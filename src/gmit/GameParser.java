package gmit;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Brian Varley
 *
 */
public class GameParser {
	
	
		private static final String GAME_FILE = "/resources/game.json";
		
		private URL sourceURL = getClass().getResource(GAME_FILE); 
		
		private int locationId;
		
		private List<Location> locations;
		private List<Item> items;
		private List<Character> characters;

		public void parse() throws IOException, URISyntaxException {
				
			ObjectMapper mapper = new ObjectMapper();
		    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

			 
			try {
					
				// read from file, convert it to Location class
				Location loc = new Location();
				loc = mapper.readValue(new File(sourceURL.toURI()), Location.class);
				Item item = mapper.readValue(new File(sourceURL.toURI()), Item.class);
				GameCharacter character = mapper.readValue(new File(sourceURL.toURI()), GameCharacter.class);
								
				// display to console
				System.out.println(loc.toString());
				System.out.println(item.toString());
				System.out.println(character.toString());
				
							
				
				while(locationId < 11){
					
					Scanner console = new Scanner(System.in);
				    System.out.println("Enter the location ID between 1 - 10 to where you want to go:");
			        locationId = console.nextInt();
					
					loc.findLocation(locationId);
				
				}
			
			} catch (JsonGenerationException e) {
		 
				e.printStackTrace();
		 
			} catch (JsonMappingException e) {
		 
				e.printStackTrace();
		 
			} catch (IOException e) {
		 
				e.printStackTrace();
		 
			}
			
			/*
			public Location findLocation(Integer locationId) {
				Location result = null;
				for (Location l : location) {
					System.out.println("In find method...");
					result = dfs(new HashSet<Location>(), l, locationId);
					if (result != null)
						System.out.println("You are now in.." + result);
						break;
				}
				return result;
			}
			
			private Location dfs(Set<Location> visitedAlready, Location current,
					Integer id) {
				if (current.id == id)
					return current;
				visitedAlready.add(current); 
				Location result = null;
				for (Location l : current.location) {
					result = dfs(visitedAlready, l, id);
					if (result != null)
						break;
				}
				return result;
			}
			
			*/
			
			
		}
		
}
