package d03_06_2022;
//U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih
// tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.


public class Main {
    public static void main(String[] args) {

        Korpa korpa = new Korpa();
        SuperKartica s = new SuperKartica(888,"Milos Milutinovic",50);
        korpa.dodajAmbalazu(new Tetrapak("123456",
                "Coca Cola",
                2,
                3,
                true,
                100));
        korpa.dodajAmbalazu(new Tetrapak("369874","Fanta",
                4,5,false,200));

        korpa.dodajAmbalazu(new StaklenaAmbalaza("125897", "Beni",
                12,15,100, true,300));

        s.stampaj();
        korpa.stampaj();
        System.out.println();
        System.out.println("Ukupna cena sa popustom je: " + korpa.cenaKorpe(s));
    }

}
