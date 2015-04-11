package gmit;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;



/**
 * @author Brian Varley
 * Adapted from @author John Healy - AI Module GMIT
 */
public class BeamSearch implements SearchAlgorithm{
	
	LinkedList<Location> queue = new LinkedList<Location>();
	HeuristicNodeComparator sorter = new HeuristicNodeComparator();
	int beamWidth= 3;
	
	public void search(Location location){
		
		queue.addFirst(location);
		int totalDistance = 0;
		while(!queue.isEmpty()){
			queue.removeFirst();
			System.out.print("Visiting " + location.getName() + "\t");
			if (location.isGoalLocation()){
				System.out.println("Reached goal node " + location.getName() + " after " + totalDistance + " miles.");
				System.exit(0);
			}else{
				Location[] children = location.children();	
				Collections.sort(Arrays.asList(children), sorter);
				
				int bound = 0;
				if (children.length < beamWidth){
					bound = children.length;
				}else{
					bound = beamWidth;
				}
				for (int i = 0; i < bound; i++) {
					if (!children[i].isVisited()){
						queue.addLast(children[i]);
					}
				}
				System.out.println(queue);
				totalDistance = totalDistance + location.getDistance(queue.getFirst());
				location = queue.getFirst();
				location.setVisited(true);
			}
		}
		
	}
	
	private void path(Location location){
		List<Location> path = new ArrayList<Location>();
		while(location.getParent() != null){
			path.add(location);
			location = location.getParent();
		}
		path.add(location);
		Collections.reverse(path);
		System.out.println("Path: " + path + ". Distance of " + distance(path));
	}
	
	private int distance(List<Location> path){
		int distance = 0;
		for (int i = 0; i < path.size(); i++) {
			if (i + i <= path.size()) distance += path.get(i).getDistance(path.get(i + 1));
		}
		return distance;
	}

	
}
