package cz.java.dedicnost;

public class Potomek2 extends Predek {
    protected int cisloPotomek2;

    public int getCisloPotomek2() {
        return cisloPotomek2;
    }

    public void setCisloPotomek2(int cisloPotomek2) {
        this.cisloPotomek2 = cisloPotomek2;
    }

    public Potomek2(int cisloPotomek2) {
        super(555);
        this.cisloPotomek2 = cisloPotomek2;
        System.out.println("Konstruktor tridy Potomek2 vcetne volani super(555)");
    }

    public Potomek2() {
        System.out.println("Konstruktor tridy Potomek2");
    }
}

