package HumanAndCloset;

import java.util.Random;

public class Closet {
    private boolean closed;

    public Closet() {
        this.closed = closedByRandom();
    }

    private boolean closedByRandom() {
        Random random = new Random();
        return random.nextBoolean();
    }

    @Override
    public String toString() {
        if (closed) {
            return "Этот шкаф закрыт";
        }
        else {
            return "Этот шкаф открыт";
        }
    }
    public void setClosedByMagic (String magic) {
        if (magic.equals("Сим сим, откройся")) {
            closed = false;
            System.out.println("Шкаф открыт");
        } else {
            System.out.println("Проходите мимо я вас не знаю");
        }
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosedTrue() {
        closed = true;
    }
}
