package cz.java.dedicnost;

public class HlavniTrida {

    public static void main(String args[]){

        Predek predek = new Predek(999);
        Potomek1 potomek1 = new Potomek1(1);
        Potomek2 potomek2 = new Potomek2(2);
        Potomek3 potomek3 = new Potomek3(3);

        System.out.println("===== Vypisy =====");
//        System.out.println("potomek1.getCisloPotomek1: " + potomek1.getCisloPotomek1() + ", potomek1.getCisloPredek: " + potomek1.getCisloPredek());


        System.out.println("Predek pokusnyPredek = new Potomek2(2);");
        Predek pokusnyPredek = new Potomek2(2);
        System.out.println(pokusnyPredek.getCisloPredek());
        System.out.println(((Potomek2) pokusnyPredek).cisloPotomek2);

        Predek p = Predek.createPredek();

    }


}
