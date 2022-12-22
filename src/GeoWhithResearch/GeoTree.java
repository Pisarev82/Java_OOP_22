package GeoWhithResearch;

import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person parent, Person children, Relationship r1, Relationship r2) {
        tree.add(new Node(parent, r1, children));
        tree.add(new Node(children, r2, parent));
    }

}
