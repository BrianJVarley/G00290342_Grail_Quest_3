package ie.gmit.computing.grailquest;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Brian Varley
 *
 */
public class Exit {

	@JsonProperty("@title")
	private String title;

	@JsonProperty("@direction")
	private String direction;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return "Exit [title=" + title + ", direction=" + direction + "]";
	}

}
