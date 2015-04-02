package gmit;

import java.util.Arrays;

/**
 * @author Brian
 *
 */
public class GameCharacter {
	
	private String name;
	
	private Item[] item;

    private String searchAlgorithm;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Item[] getItem() {
		return item;
	}

	public void setItem(Item[] item) {
		this.item = item;
	}

	public String getSearchAlgorithm() {
		return searchAlgorithm;
	}

	public void setSearchAlgorithm(String searchAlgorithm) {
		this.searchAlgorithm = searchAlgorithm;
	}

	@Override
	public String toString() {
		return "GameCharacter [name=" + name + ", item="
				+ Arrays.toString(item) + ", searchAlgorithm="
				+ searchAlgorithm + "]";
	}

	
    
    

}
