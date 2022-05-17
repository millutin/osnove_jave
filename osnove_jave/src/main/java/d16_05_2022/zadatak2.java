package d16_05_2022;

import java.util.ArrayList;

//Napisati funkciju koja za dva jednocifrena broja koja su
// ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru:
//        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
public class zadatak2 {
    public static void main(String[] args) {


        String novaVrednost = vrednost(8, 3);
        System.out.println("Nova vrednost je: " + novaVrednost);
    }

    static String vrednost(int a, int b) {

        return (a + "" + b);
    }
}

