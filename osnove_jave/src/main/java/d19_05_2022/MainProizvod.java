package d19_05_2022;

public class MainProizvod {
    public static void main(String[] args) {

        Proizvod Pecivo = new Proizvod();

        Pecivo.naziv = "Kroasan";
        Pecivo.cena = 65;
        Pecivo.tezina = 85;

        Pecivo.stampaj();
        Pecivo.povecajCenu(10);
        System.out.println("Cena nakon povecanja");
        Pecivo.stampaj();
        System.out.println("Cena sa popustom " + Pecivo.vratiCenuSaPopustom(10));
        System.out.println("Cena postarine je " + Pecivo.racunajPostarinu());

        System.out.println();



        Proizvod Sir = new Proizvod();

        Sir.naziv = "Gauda";
        Sir.cena = 460;
        Sir.tezina = 200;

        Sir.stampaj();
        Sir.povecajCenu(10);
        System.out.println("Cena nakon povecanja");
        Sir.stampaj();
        System.out.println("Cena sa popustom " + Sir.vratiCenuSaPopustom(10));
        System.out.println("Cena postarine je " + Sir.racunajPostarinu());

    }
}
