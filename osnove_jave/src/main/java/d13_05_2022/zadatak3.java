package d13_05_2022;
//    Napisati program koji ima niz brojeva duzine 10.
//    Niz je fiksnih vrednosti (ne u nosi ih korisnik)
//    a zatim se od korisnika ucitava pozicija elementa koji zeli da izbaci iz niza.
//    Pre i nakon izbacivanja ispisati niz na ekranu.
//    Ukoliko korisnik unese poziciju van opsega niza, ispisati poruku o gresci.
//        Primer izvrsenja 1:
//        Niz je: 1,3,5,6,7,1,3,4,2,9
//        Unesite poziciju za izbacivanje: 5
//        Niz nakon brisanja je: 1,3,5,6,7,3,4,2,9
//
//        Primer izvrsenja 2:
//        Niz je: 1,3,5,6,7,1,3,4,2,9
//        Unesite poziciju za izbacivanje: 11
//        Uneli ste nevalidnu poziciju!

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        ArrayList<Integer> broj = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        broj.add(1);
        broj.add(3);
        broj.add(7);
        broj.add(5);
        broj.add(4);
        broj.add(6);
        broj.add(7);
        broj.add(8);
        broj.add(9);
        broj.add(5);
        System.out.print("Niz je: ");
        for (int i = 0; i < broj.size(); i++) {

            System.out.print(broj.get(i) + ",");
        }
        System.out.println();
        System.out.print("Unesite poziciju za izbacivanje: ");
        int pozicija = s.nextInt();

         if (pozicija > 9){
             System.out.println("Uneli ste nevalidnu poziciju!");
         }else {
           broj.remove(pozicija);
             System.out.print("Niz nakon brisanja je: ");

             for (int i = 0; i < broj.size(); i++) {

                 System.out.print(broj.get(i) + ",");
             }

         }


    }
}
