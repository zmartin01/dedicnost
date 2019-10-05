package cz.java.dedicnost;

public class Potomek1 extends Predek {
    private int cisloPotomek1;

    public int getCisloPotomek1() {
        return cisloPotomek1;
    }

    public void setCisloPotomek1(int cisloPotomek1) {
        this.cisloPotomek1 = cisloPotomek1;
    }

    public Potomek1(int cisloPotomek1) {
        super(555);
        this.cisloPotomek1 = cisloPotomek1;
        System.out.println("Konstruktor tridy Potomek1 vcetne volani super(555)");
    }

    public Potomek1() {
        System.out.println("Konstruktor tridy Potomek1");
    }

}
