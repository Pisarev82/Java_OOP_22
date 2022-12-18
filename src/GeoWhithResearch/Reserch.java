package GeoWhithResearch;

import java.util.ArrayList;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        result.add(p.getFullName() + " является " + re.toString() + " для : ");
        /*
        При выводе на печать появляется дополнительная запятая после :
        Фиксить  не по заданию
         */
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

}
