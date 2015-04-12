package ie.gmit.computing.grailquest;

public class GameGraph {

	/**
	 * @author Brian Varley
	 */
	public GameGraph() {

		// Creating a graph
		Graph graph = new Graph();
		graph.addVertex("Tiberius");
		graph.addVertex("Desert");
		graph.addVertex("Jerusalem");
		graph.addVertex("Hattin");
		graph.addVertex("Damascus");
		graph.addVertex("Tripoli");
		graph.addVertex("Antioch");
		graph.addVertex("Sis");
		graph.addVertex("Tarsus");
		graph.addVertex("Cyprus");

		graph.addEdge("Tiberius", "Desert");
		graph.addEdge("Desert", "Jerusalem");
		graph.addEdge("Jerusalem", "Hattin");
		graph.addEdge("Hattin", "Damascus");
		graph.addEdge("Damascus", "Tripoli");
		graph.addEdge("Tripoli", "Antioch");
		graph.addEdge("Antioch", "Sis");
		graph.addEdge("Sis", "Tarsus");
		graph.addEdge("Tarsus", "Cyprus");

		System.out.println("graph: " + graph.getGraph().toString());

	}

}
