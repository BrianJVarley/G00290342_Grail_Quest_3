package gmit;


import java.util.Comparator;

/**
 * @author Brian
 *
 */
public class HeuristicNodeComparator implements Comparator<Location> {

	@Override
	public int compare(Location loc1, Location loc2) {
		if (loc1.getApproximateDistanceFromGoal() > loc2.getApproximateDistanceFromGoal()){
			return 1;
		}else if (loc1.getApproximateDistanceFromGoal() < loc2.getApproximateDistanceFromGoal()){
			return -1;
		}else{
			return 0;
		}
	}

	
}
