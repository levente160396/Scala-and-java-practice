package advancedAlgorithm.BreatdthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private int data;

    private boolean isVisited;

    private List<Vertex> neighbourList;

    public Vertex(int data) {
        this.data = data;
        this.neighbourList = new ArrayList<>();
    }

    public void addNeighbourVertex(Vertex vertex) {
        this.neighbourList.add(vertex);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public List<Vertex> getNeighbourList() {
        return neighbourList;
    }

    public void setNeighbourList(List<Vertex> neighbourList) {
        this.neighbourList = neighbourList;
    }

    @Override
    public String toString() {
        return " "+ this.data;
    }
}
