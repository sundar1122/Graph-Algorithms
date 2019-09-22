package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Graph {
	
	private Set<Node> nodes;
	private List <Edge> edgeList;
	

	public Graph() {
		nodes = new TreeSet<Node>();
		edgeList = new ArrayList<Edge>();
	}
	
	
	public Node addNode(int nodeId) {
		Optional<Node> nodeInSet = nodes.stream().filter(node -> (node.getId() == nodeId)).findFirst();
		Node newNode = nodeInSet.isPresent() ? nodeInSet.get() : new Node(nodeId);	
		nodes.add(newNode);
		return newNode;
	}
	
	public void addEdge(int start, int end, double weight) {
		Node startNode = this.addNode(start);
		Node endNode = this.addNode(end);
		Edge e = new Edge(startNode, endNode, weight);
		edgeList.add(e);
	}
	
	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append("Graph\n");
		s.append("Number of Nodes: " + this.nodes.size() + "\n");
		s.append("Nodes: ");
		for (Node n : nodes) {
			s.append(n.getId() + ", ");
		}
		s.append("\n");
		for (Edge e : edgeList) {
			s.append("Edge => Start Node : " + e.getSourceNode().getId() + 
					" - Dest Node : " + e.getDestNode().getId() + 
					" Weight: " + e.getWeight() + "\n");
		}
		
		return s.toString();
	}
	
	
	public static void main(String[] args) {
		System.out.println("Generating a random Graph with 10 nodes and 100 edges ...");
		
		Graph g = new Graph();
		Random r = new Random();
		r.setSeed(1000); // Ensures the same stream of random numbers.
		int nNodes = 5;
		int nEdges = 20;
		for (int i = 0; i < nEdges; i++) {
			int s = r.nextInt(nNodes) + 1;
			int t = r.nextInt(nNodes - 1) + 1;
			if (t >= s) t++;
			double weight = r.nextInt(50) + 1;
			g.addEdge(s, t, weight);
		}
		System.out.println(g);
	}
}
