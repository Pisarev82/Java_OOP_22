package HumanAndPet;

public class Dog extends Pet implements PetBehavior{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Гав");
    }

    @Override
    public void attack() {
        System.out.println("Кусается");
    }
}
