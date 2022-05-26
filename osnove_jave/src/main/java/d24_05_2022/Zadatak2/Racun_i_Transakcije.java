package d24_05_2022.Zadatak2;

public class Racun_i_Transakcije {
    public static void main(String[] args) {

        Racun salje = new Racun("160-2584658-85", "Milos Milutinovic", 25520);

        Racun prima = new Racun("160-5258248-74", "Marko Markovic", 10000);

        Transakcije transakcije = new Transakcije(258, salje, prima);
        transakcije.izvrsiTransakciju(7500);

        salje.stampaj();
        prima.stampaj();
        transakcije.stampaj();
    }
}
