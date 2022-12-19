package GeoWhithResearch;

import java.util.Arrays;

public class Main {
    /*
    Изучено строение и работа классов в пакете GeoWithResearch
    Добавленна связь marriage и реализован ее вывод в консоль.
     */
    public static void main(String[] args) {
        Person irina = new Person("Ирина");
        Person alesha = new Person("Алеша");
        Person vasya = new Person("Вася");
        Person masha = new Person("Маша");
        Person jane = new Person("Женя");
        Person ivan = new Person("Ваня");
        GeoTree gt = new GeoTree();
        gt.appendChild(irina, vasya);
        gt.appendChild(irina, masha);
        gt.appendChild(vasya, jane);
        gt.appendChild(vasya, ivan);
        gt.appendMarrege(alesha, irina);


        System.out.println(new Reserch(gt).spend(irina,
                Relationship.parent));

        System.out.println(new Reserch(gt).spend(irina,
                Relationship.marriage));

    }

}
