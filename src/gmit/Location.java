package gmit;


import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Brian
 *
 */
public class Location {
	
    private Location[] location;
	
	private int id;

	private String description;
	
	private String weight;

    private String name;

    private Exit[] exit;
    
    private boolean visited = false;
	private boolean goalLocation;
	private int approximateDistanceFromGoal = 0;
	private Location parent;
	
	private Map<Location, Integer> children = new HashMap<Location, Integer>();
	
	public Location() {
		super();
	}

	public Location(String name){
		this.name = name;
	}
	
	public Location(String name, int goalDistance){
		this.name = name;
		this.approximateDistanceFromGoal = goalDistance;
	}
	
	
	
	public Location[] children(){
		return (Location[]) children.keySet().toArray(new Location[children.size()]);
	}
	
	public int getDistance(Location loc){
		if(children.get(loc) == null) System.out.println(this.name + ": " + loc.getName());
		return children.get(loc);
	}
	
	
	public int getChildLocationCount(){
		return children.size();
	}

	public void addChildLocation(Location child, int distance){
		children.put(child, distance);
	}
	
	public boolean isLeaf(){
		if (children.size() > 0){
			return false;
		}else{
			return true;
		}
	}
	
	
	public void removeChild(Location child){
		children.remove(child);
	}
   
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }
    

    public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

	public Exit[] getExit() {
		return exit;
	}

	public void setExit(Exit[] exit) {
		this.exit = exit;
	}
	
	
	public Location[] getLocation() {
		return location;
	}

	public void setLocation(Location[] location) {
		this.location = location;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public boolean isGoalLocation() {
		return goalLocation;
	}

	public void setGoalLocation(boolean goalLocation) {
		this.goalLocation = goalLocation;
	}

	public int getApproximateDistanceFromGoal() {
		return approximateDistanceFromGoal;
	}

	public void setApproximateDistanceFromGoal(int approximateDistanceFromGoal) {
		this.approximateDistanceFromGoal = approximateDistanceFromGoal;
	}

	public Location getParent() {
		return parent;
	}

	public void setParent(Location parent) {
		this.parent = parent;
	}
	
	
	public Location findLocation(Integer locationId) {
		Location result = null;
		for (Location l : location) {
			System.out.println("In find method...");
			result = depthFirstSearch(new HashSet<Location>(), l, locationId);
			if (result != null)
				System.out.println("You are now in.." + result);
				break;
		}
		return result;
	}
	
	private Location depthFirstSearch(Set<Location> visitedAlready, Location current,
			Integer id) {
		if (current.id == id)
			return current;
		visitedAlready.add(current); 
		Location result = null;
		for (Location l : current.location) {
			result = depthFirstSearch(visitedAlready, l, id);
			if (result != null)
				break;
		}
		return result;
	}

	@Override
	public String toString() {
		return "Location [location=" + Arrays.toString(location) + ", id=" + id
				+ ", description=" + description + ", weight=" + weight
				+ ", name=" + name + ", exit=" + Arrays.toString(exit) + "]";
	}

	
	
	
	
	

	

	

	

	
	

	
	

	
	
	
	

}
