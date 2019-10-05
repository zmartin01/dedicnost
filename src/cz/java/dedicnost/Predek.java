package cz.java.dedicnost;

public class Predek {

    private int cisloPredek;
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

    public Predek(){
        System.out.println("Konstruktor tridy Predek");
    }


}
