package d13_05_2022;
//  Napisati program koji ima niz brojeva od 25 elemenata, koji izgleda kao tabela 5x5.
//  Niz je fiksnih vrednosti (ne unosi ih korisnik) zatim korisnik unosi poziciju za koju se racuna suma.
//  Suma za poziciju se racuna tako sto se na vrednost tog polja dodaju vrednosti elemenata
//  iznad, ispod, sleve i sdesne strane tog elementa
// (Ukoliko ti elementi postoje, vodite racuna da ne izadjete van opsega niza)
//  Za racunanje sume, nije potrebna petlja!
//Primer izvrsenja:
//        2,4,6,7,4,
//        4,2,5,1,4,
//        1,4,9,4,5,
//        4,8,5,4,7,
//        4,4,7,4,1,
//        Unesite poziciju: 12
//        Suma je 27 (Objasnjenje: jer se sumira 9+5+4+4+5, pogledaj sliku)


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {

        ArrayList<Integer> niz = new ArrayList<Integer>();
        Random random = new Random();
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 25; i++) {
            int randomBroj = random.nextInt(10);
            niz.add(randomBroj);
        }

        for (int i = 0; i < niz.size(); i++) {
            System.out.print(niz.get(i) + ", ");
            if (i % 5 == 4) {
                System.out.println();
            }
        }
        System.out.println("Unesite poziciju: ");
        int pozicija = s.nextInt();

        if (pozicija == 0) {
            System.out.print("Suma je: ");
            System.out.println(niz.get(pozicija) + niz.get(pozicija + 1) + niz.get(pozicija + 5));
        }
        if (pozicija == 4) {
            System.out.print("Suma je: ");
            System.out.println(niz.get(pozicija) + niz.get(pozicija - 1) + niz.get(pozicija + 5));
        }
        if (pozicija == 20) {
            System.out.print("Suma je: ");
            System.out.println(niz.get(pozicija) + niz.get(pozicija + 1) + niz.get(pozicija - 5));
        }
        if (pozicija == 24) {
            System.out.print("Suma je: ");
            System.out.println(niz.get(pozicija) + niz.get(pozicija - 1) + niz.get(pozicija - 5));
        }
        if (pozicija == 1 || pozicija == 2 || pozicija == 3) {
            System.out.print("Suma je: ");
            System.out.println(niz.get(pozicija) + niz.get(pozicija - 1) + niz.get(pozicija + 1)
                    + niz.get(pozicija + 5));
        }
        if (pozicija == 5 || pozicija == 10 || pozicija == 15) {
            System.out.print("Suma je: ");
            System.out.println(niz.get(pozicija) + niz.get(pozicija - 5) + niz.get(pozicija + 1)
                    + niz.get(pozicija + 5));
        }
        if (pozicija == 9 || pozicija == 14 || pozicija == 19) {
            System.out.print("Suma je: ");
            System.out.println(niz.get(pozicija) + niz.get(pozicija - 5) + niz.get(pozicija - 1)
                    + niz.get(pozicija + 5));
        }
        if (pozicija == 21 || pozicija == 22 || pozicija == 23) {
            System.out.print("Suma je: ");
            System.out.println(niz.get(pozicija) + niz.get(pozicija - 5) + niz.get(pozicija - 1)
                    + niz.get(pozicija + 1));
        }
        if (pozicija == 6 || pozicija == 7 || pozicija == 8 ||
                pozicija == 11 || pozicija == 12 || pozicija == 13 ||
                pozicija == 16 || pozicija == 17 || pozicija == 18) {
            System.out.print("Suma je: ");
            System.out.println(niz.get(pozicija) + niz.get(pozicija - 5) + niz.get(pozicija - 1) +
                    niz.get(pozicija + 1) + niz.get(pozicija+5));
        }


    }
}
