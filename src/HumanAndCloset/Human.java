package HumanAndCloset;

public class Human {

    private final String Name;

    public Human(String name) {
        Name = name;
    }

    public void tryOpenCloset(Closet closet, String magicPhrase){
        if(closet.isClosed()) {
            System.out.println(magicPhrase);
            closet.setClosedByMagic(magicPhrase);
        } else {
            System.out.println("Открытый шкаф открыть нельзя (@ магистр Йода)");
        }
    }

    public void closeCloset(Closet closet){
        closet.setClosedTrue();
    }

    @Override
    public String toString() {
        if(Name.equals("Николай Владимирович")){
            return "Хороший человек " + Name;
        }
        else {
            return Name;
        }
    }
}
