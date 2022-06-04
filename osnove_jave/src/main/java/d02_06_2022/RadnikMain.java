package d02_06_2022;

import java.util.ArrayList;

public class RadnikMain {
    public static void main(String[] args) {

        Sektor a = new Sektor ("a", 15000);
        Sektor b = new Sektor ("b", 22000);
        Sektor c = new Sektor ("c", 36000);
        Sektor d = new Sektor ("d", 17000);
        Sektor e = new Sektor ("e", 44000);
        Sektor f = new Sektor ("f", 50000);


        ArrayList <Sektor> sektori = new  ArrayList <Sektor>();

        sektori.add(a);
        sektori.add(b);
        sektori.add(c);
        sektori.add(d);
        sektori.add(e);
        sektori.add(f);



        Menadzer menadzer1 = new Menadzer("Milos Milutinovic");

        menadzer1.zaposliUSektor(a);
        menadzer1.zaposliUSektor(b);
        menadzer1.zaposliUSektor(c);
        menadzer1.zaposliUSektor(d);
        menadzer1.zaposliUSektor(e);
        menadzer1.zaposliUSektor(f);




        Magacioner magacioner1 = new Magacioner ("Marko Markovic");

        magacioner1.zaposliUSektor(a);
        magacioner1.zaposliUSektor(b);
        magacioner1.zaposliUSektor(c);
        magacioner1.zaposliUSektor(d);
        magacioner1.zaposliUSektor(e);
        magacioner1.zaposliUSektor(f);



        System.out.println(menadzer1.getImeIPrezime() + ", Plata: " + menadzer1.plataRadnika());
        System.out.println( magacioner1.getImeIPrezime() + ", Plata: " + magacioner1.plataRadnika());






    }
}
