package GeoWhithResearch;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GeoTree implements SaveToFile {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person parent, Person children, Relationship r1, Relationship r2) {
        tree.add(new Node(parent, r1, children));
        tree.add(new Node(children, r2, parent));
    }

    @Override
    public void saveToFile() throws IOException {
        try (FileWriter writer = new FileWriter("GeoTree.txt", false)) {
            for (Node n: tree) {
                writer.write(n.toString() + "\n");
            }
            writer.flush();
        } catch (IOException ex) {
        }
    }
}
