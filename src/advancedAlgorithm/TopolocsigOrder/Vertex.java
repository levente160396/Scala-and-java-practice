package advancedAlgorithm.TopolocsigOrder;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String data;

    private boolean isVisited;

    private List<Vertex> neighboursList;

    public Vertex(String data) {
        this.data = data;
        this.neighboursList = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex) {
        neighboursList.add(vertex);
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public List<Vertex> getNeighboursList() {
        return neighboursList;
    }

    public void setNeighboursList(List<Vertex> neighboursList) {
        this.neighboursList = neighboursList;
    }

    @Override
    public String toString(){
        return  this.data;
    }
}
