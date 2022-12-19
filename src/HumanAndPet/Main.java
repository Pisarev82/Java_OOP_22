package HumanAndPet;

public class Main {


    public static void main(String[] args) {
        Human human = new Human("Николай Владимирович");
        Cat cat = new Cat("Дармоед");
        Plate plate = new Plate();
        human.CallCat(cat.getName());
        human.fed(plate);
        cat.setHungry(true);
        cat.eat(plate);
    }
}
