package GeoWhithResearch;

import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void appendChild(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }
    public void appendMarrege(Person maile, Person femail) {
        tree.add(new Node(maile, Relationship.marriage, femail));
        tree.add(new Node(femail, Relationship.marriage, maile));
    }

}
