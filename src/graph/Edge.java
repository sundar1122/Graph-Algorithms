package graph;

public class Edge {
	private Node sourceNode;
	private Node destNode;
	private double weight;
	
	public Edge(Node src, Node dest, double weight) {
		this.sourceNode = src;
		this.destNode = dest;
		this.weight = weight;
	}
	
	public Node getSourceNode() {
		return sourceNode;
	}
	public void setSourceNode(Node sourceNode) {
		this.sourceNode = sourceNode;
	}
	public Node getDestNode() {
		return destNode;
	}
	public void setDestNode(Node destNode) {
		this.destNode = destNode;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
