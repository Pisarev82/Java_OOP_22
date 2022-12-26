package HumanAndPet;

public class Main {
    /*
    Для 3 ДЗ ничего не делал. Просто убрал лишние переносы строк, и исправил вывод на печать, что бы соответсвовал логике
    Исправил опечатки так сказать.
    */
    public static void main(String[] args) {
        Human human = new Human("Николай Владимирович");
        Cat cat = new Cat("Дармоед");
        Plate plate = new Plate();
        Plate plateAnother = new Plate();
        human.CallCat(cat.getName());
        human.fed(plate);
        human.fed(plateAnother);
        cat.setHungry(true);
        cat.eat(plate);
        Dog dog = new Dog("Сяба");
        Pet turtle = new Turtle("Финик");
        dog.eat(plate);
        turtle.setHungry(true);
        turtle.eat(plate);
        turtle.eat(plateAnother);
        if (turtle instanceof Turtle) {
            ((Turtle) turtle).attack();
        }
        System.out.println(turtle.getClass());
    }
}
