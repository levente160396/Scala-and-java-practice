package advancedAlgorithm.TopolocsigOrder;

import java.util.Stack;

public class TopologicalOrdering {

    private Stack<Vertex> stack;

    public TopologicalOrdering() {
        this.stack = new Stack<>();
    }

    public void dfs(Vertex vertex) {
        vertex.setVisited(true);

        for(Vertex v: vertex.getNeighboursList()) {
            if(!v.isVisited()) {
                v.setVisited(true);
                dfs(v);
            }
        }

        stack.push(vertex);
    }

    public Stack<Vertex> getStack() {
        return this.stack;
    }

}
