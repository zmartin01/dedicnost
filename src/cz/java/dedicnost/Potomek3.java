package cz.java.dedicnost;

public class Potomek3 extends Predek {
    private int cisloPotomek3;

    public int getCislo() {
        return cisloPotomek3;
    }

    public void setCislo(int cisloPotomek3) {
        this.cisloPotomek3 = cisloPotomek3;
    }

    public Potomek3(int cisloPotomek3) {
        super(555);
        this.cisloPotomek3 = cisloPotomek3;
        System.out.println("Konstruktor tridy Potomek3 vcetne volani super(555)");
    }

    public Potomek3(){
        System.out.println("Konstruktor tridy Potomek3");
    }

}

