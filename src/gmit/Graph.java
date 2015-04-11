package gmit;

import java.util.HashMap;
import java.util.Map;

import org.jgrapht.alg.KruskalMinimumSpanningTree;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;


/**
 * @author Brian Varley
 * Adapted from jgrapht "SimpleDirectedWeightedGraph" Demo Sample
 */
public class Graph {

    private final SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> g = new SimpleDirectedWeightedGraph<String, DefaultWeightedEdge>(DefaultWeightedEdge.class);
    static final double DEFAULT_EDGE_WEIGHT=19;
    private DefaultWeightedEdge e1;
    
    
    
    public void addVertex(String name) {
        g.addVertex(name);
    }

    public void addEdge(String v1, String v2) {
        e1 =g.addEdge(v1, v2);
        System.out.println("Edge added: " + e1.toString());
    }

    public void setEdgeWeight(String EDGE_WEIGHT) {
        g.setEdgeWeight(e1, Double.valueOf(EDGE_WEIGHT));          
    }

    public SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> getGraph() {
        return g;
    }


    public void getSpanningTree() {
        KruskalMinimumSpanningTree k = new KruskalMinimumSpanningTree(g);
        System.out.println(k.getEdgeSet().toString());
        
    }

    public void getSpanningTreeCost() {
        KruskalMinimumSpanningTree k = new KruskalMinimumSpanningTree(g);
        System.out.println(k.getSpanningTreeCost());
    }

	
}
