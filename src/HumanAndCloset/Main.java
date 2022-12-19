package HumanAndCloset;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Николай Владимирович");
Closet closet = new Closet();

        System.out.println(human);
        System.out.println(closet);
        human.tryOpenCloset(closet,"");
        System.out.println(closet);
        human.closeCloset(closet);
        System.out.println(closet);
        human.tryOpenCloset(closet,"Сим сим, откройся");
    }
}
