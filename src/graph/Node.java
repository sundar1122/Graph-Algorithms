package graph;

public class Node implements Comparable<Node> {
	private int id;
	
	public Node (int id) {
		this.id = id;
	}
	
	public boolean equals(Node o) {
		return (o.id == this.id);
	}
	
	
	@Override
	public int compareTo(Node o) {
		if (this.id < o.id) return -1;
		if (this.id > o.id) return 1; 
		return 0;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



}
