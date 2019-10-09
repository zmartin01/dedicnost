package cz.java.dedicnost;

public class Predek {

    protected int cisloPredek;
    public AggregationTrida aggregationTrida;

    public int getCisloPredek() {
        return cisloPredek;
    }

    public void setCisloPredek(int cisloPredek) {
        this.cisloPredek = cisloPredek;
    }

    public Predek(int cisloPredek) {
        this.cisloPredek = cisloPredek;
        System.out.println("Konstruktor tridy Predek");
    }

    public static Predek createPredek(){
        System.out.println("static factory method createPredek");
        return new Predek();
    }

    public Predek(){
        System.out.println("Konstruktor tridy Predek");
    }


}
