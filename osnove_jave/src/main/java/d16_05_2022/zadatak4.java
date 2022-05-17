package d16_05_2022;
//Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//        Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se=>
//        / / / / /

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesi N: ");
        int n = s.nextInt();
        System.out.print("Unesi krakter: ");
        String m = s.next();
        metodaZaStampu(n, m);

    }
    static void metodaZaStampu(int a, String b){
        for (int i = 0; i < a; i++) {
            System.out.print(b + " ");
        }


    }
}
