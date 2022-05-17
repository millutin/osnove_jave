package d16_05_2022;
//(Za vezbanje )Napisati funkciju koja pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//        Primer izvrsenja:
//        izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//        izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
//        Napomena: Resiti bez koriscenja petlji.

public class zadatak5 {
    public static void main(String[] args) {
    izbroji(5,10);

    }
     static void izbroji(int a, int b){
        int brojeviIzmedju = b - a - 1;
         System.out.println("Izmedju broja " + a+ " i broja "+ b + " ima " + brojeviIzmedju + " broja");
     }


}
