package GeoWhithResearch;

public class Main {
    /*
    Изучено строение и работа классов в пакете GeoWithResearch
    Добавленна связь marriage и реализован ее вывод в консоль.
     */
     /*
     Для дз 2:
     Добавлен поиск по возрасту персон которым больше лет чем указано в запросе.
     Исправлен меттод append (теперь принимает 2 людей и 2 связи)
     Куда в этом коде добавить наследование, абстрактные классы или интерфейсы не придумал.
     Вернее не придумал задачу для которой бы понадобилось переделать код с использованием вышеперечисленного.
     (и про родословную и про национальность и про дополнительные связи думал. Все это реализуется просто добавлением полей.)
     А методы в Reserch настолько уникальны, что использовать для них интерфейсы странно.
     */
    public static void main(String[] args) {
        Person irina = new Person("Ирина", 30);
        Person alesha = new Person("Алеша", 33);
        Person vasya = new Person("Вася", 1);
        Person masha = new Person("Маша", 3);
        Person jane = new Person("Женя", 50);
        Person ivan = new Person("Ваня", 55);
        GeoTree gt = new GeoTree();
        gt.append(irina, vasya, Relationship.parent, Relationship.children);
        gt.append(irina, masha, Relationship.parent, Relationship.children);
        gt.append(vasya, jane, Relationship.parent, Relationship.children);
        gt.append(vasya, ivan, Relationship.parent, Relationship.children);
        gt.append(alesha, irina, Relationship.marriage, Relationship.marriage);


        System.out.println(new Reserch(gt).spend(irina,
                Relationship.parent));

        System.out.println(new Reserch(gt).spend(irina,
                Relationship.marriage));

        System.out.println(new Reserch(gt).spend(29));
    }

}
