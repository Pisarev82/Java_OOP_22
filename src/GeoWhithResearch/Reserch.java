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
        Делать метод для красивой печати - не отностится к теме семинара.
         */
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    public ArrayList<String> spend(int age) {
        ArrayList<Person> list = new ArrayList<>();
        for (Node t : tree) {
            if (t.p1.age > age && !list.contains(t.p1)) {
                list.add(t.p1);
                result.add(t.p1.fullName);
            }
        }
        return result;
    }

}
