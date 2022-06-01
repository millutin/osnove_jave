package d31_05_2022.Zadatak1;
// U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.


public class main {
    public static void main(String[] args) {


        Igrac vezni = new Igrac("Milos Milutinovic",
                "0312985730018",
                1985,
                33,"vezni",
                false);
        Igrac napadac = new Igrac("Dragan Jovanovic",
                "0511982730018",
                1982,
                16,
                "napadac",
                true);
        vezni.stampaj();
        napadac.stampaj();

        Trener kondicioni = new Trener("Marko Markovic",
                "123456789",
                1972,
                18,
                "kondicioni");
        Trener pomocni = new Trener("Nenad Petrovic",
                "2504989730018",
                1989,
                12,
                "pomocni");
        kondicioni.stampaj();
        pomocni.stampaj();
    }

}
