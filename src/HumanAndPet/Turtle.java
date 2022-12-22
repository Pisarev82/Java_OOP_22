package HumanAndPet;

public class Turtle extends Pet implements PetBehavior{
    public Turtle(String name) {
        super(name);
    }

    @Override
    public void voice() {
        PetBehavior.super.voice();
    }

    @Override
    public void attack() {
        System.out.println("Падает со шкафа");
    }
}
