package d16_05_2022;
//        (Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//         U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
public class zadatak6 {
    public static void main(String[] args) {
    int n = najmanjiBroj(58,24,66);
        System.out.println("Najmanji broj je " + n);

    }
     static int najmanjiBroj(int a, int b, int c){
        if (a<b && a<c){
            return a;
        } else if (b<a && b<c) {
            return b;
        }else if (c<a && c<b){
            return c;
        }
       return a;
     }



}
