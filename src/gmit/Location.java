package gmit;

import java.util.Arrays;

public class Location {
	
	private Location[] location;

	private String description;
	
	private String weight;

    private String name;

    private Exit[] exit;
    
   

	public Location[] getLocation() {
		return location;
	}

	public void setLocation(Location[] location) {
		this.location = location;
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

	@Override
	public String toString() {
		return "Location [location=" + Arrays.toString(location)
				+ ", description=" + description + ", weight=" + weight
				+ ", name=" + name + ", exit=" + Arrays.toString(exit) + "]";
	}

	

	

	
	

	
	

	
	
	
	

}
