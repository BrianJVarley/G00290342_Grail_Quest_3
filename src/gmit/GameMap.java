package gmit;

public class GameMap {
	
	
private Location tiberius;
	
	/**
	 * @author Brian Varley
	 */
	public GameMap() {
		
		//Creating Locations
		tiberius = new Location("Tiberius", 200);
		tiberius.setDescription("You are in the city of Tiberius. You see a long street with high buildings and a castle.You see an exit to the south.");
		Location desert = new Location("Desert", 170);
		desert.setDescription("You are in hot dreary desert, surrounded by sand dunes and nothingness, you see an exit to the south.");
		Location jerusalem = new Location("Jerusalem", 270);
		jerusalem.setDescription("You are at battlefield of Jerusalem. You are in awe of your surroundings, you see an exit to the west.");
		Location hattin = new Location("Hattin", 120);
		hattin.setDescription("You are at battlefield of Hattin. You see the ruination of the battle and fallen comrades...You see an exit to the north.");
		Location damascus = new Location("Damascus", 130);
		damascus.setDescription("You are in Damascus. You see the some shady characters...you see an exit to the west.");
		Location tripoli = new Location("Tripoli", 80);	
		tripoli.setDescription("You are in Tripoli. You see the some more shady characters...you see an exit to the north.");
		Location antioch = new Location("Antioch", 60);
		antioch.setDescription("You are in the city of Antioch. You see a long street with high buildings and a castle.. You see the some more shady characters...you see an exit to the north.");
		Location sis = new Location("Sis", 100);
		sis.setDescription("You are in the city of Sis....exit ahead in the west.");
		Location tarsus = new Location("Tarsus", 20);
		tarsus.setDescription("You are in the city of Tarsus. ...you see an exit to the south.");
		Location cyprus = new Location("Cyprus", 0);
		cyprus.setDescription("You have reached the Byzantine Empire, your quest has finished!");
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
