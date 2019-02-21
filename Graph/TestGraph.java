import Graph.*;

public class TestGraph
{
	public static void main(String[] args)
	{
		Graph g = new Graph(3);
		g.addEdge(0, 0);
		g.addEdge(1, 2);
		g.addEdge(2, 1);
	}
}