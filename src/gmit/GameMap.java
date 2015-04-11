package gmit;

public class GameMap {
	
	
private Location tiberius;
	
	/**
	 * @author Brian
	 */
	public GameMap() {
		
		//Creating Locations
		tiberius = new Location("Tiberius", 200);
		Location desert = new Location("Desert", 170);
		Location jerusalem = new Location("Jerusalem", 270);
		Location hattin = new Location("Hattin", 120);
		Location damascus = new Location("Damascus", 130);
		Location tripoli = new Location("Tripoli", 80);	
		Location antioch = new Location("Antioch", 60);
		Location sis = new Location("Sis", 100);
		Location tarsus = new Location("Tarsus", 20);
		Location cyprus = new Location("Cyprus", 0);
		cyprus.setGoalLocation(true);
		
		//Adding child locations
		tiberius.addChildLocation(desert, 105);
		desert.addChildLocation(jerusalem, 105);
		jerusalem.addChildLocation(hattin, 323);
		hattin.addChildLocation(damascus, 121);
		damascus.addChildLocation(tripoli, 121);
		tripoli.addChildLocation(antioch, 220);
		antioch.addChildLocation(sis, 126);
		sis.addChildLocation(tarsus, 121);	
		tarsus.addChildLocation(cyprus, 126);
		
		
			
	}
	
	public Location getStartNode(){
		return tiberius;
	}

}
