package cz.java.dedicnost;

public class HlavniTrida {

    public static void main(String args[]){
        System.out.println("Zacatek");
        Predek predek;

        predek = new Predek();
        predek = new Potomek1();
        predek = new Potomek2();
        predek = new Potomek3();

        System.out.println("Konec");
    }


}
