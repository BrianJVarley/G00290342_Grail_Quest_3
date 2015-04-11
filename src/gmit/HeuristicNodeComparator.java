package gmit;


import java.util.Comparator;

/**
 * @author Brian
 * Adapted from @author John Healy - AI Module GMIT
 */
public class HeuristicNodeComparator implements Comparator<Location> {

	public int compare(Location loc1, Location loc2) {
		if (loc1.getApproximateDistanceFromGoal() > loc2.getApproximateDistanceFromGoal()){
			return 1;
		}else if (loc2.getApproximateDistanceFromGoal() < loc2.getApproximateDistanceFromGoal()){
			return -1;
		}else{
			return 0;
		}
	}

	
	
}
