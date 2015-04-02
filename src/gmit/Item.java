package gmit;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Brian
 *
 */
public class Item {
	
	private Item[] item;
	
	@JsonProperty("@name")
    private String name;
	
	@JsonProperty("@locationID")
    private String locationID;

	public Item[] getItem() {
		return item;
	}

	public void setItem(Item[] item) {
		this.item = item;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocationID() {
		return locationID;
	}

	public void setLocationID(String locationID) {
		this.locationID = locationID;
	}

	@Override
	public String toString() {
		return "Item [item=" + Arrays.toString(item) + ", name=" + name
				+ ", locationID=" + locationID + "]";
	}
	
	
	

}
