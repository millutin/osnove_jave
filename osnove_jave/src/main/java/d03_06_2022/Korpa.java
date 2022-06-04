package d03_06_2022;
//     Kreirati klasu Korpa koja ima:
//        niz ambalaza
//        metodu dodaj ambalazu
//        metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase
//        (String) koju treba izbaciti
//        privatnu metodu koja vraca cenu svih ambalaza sa popustom,
//        metoda kao parametar prima popust.
//        metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze),
//        kao parametar funkcije se prima Super karticu iz koje se cita popust.


import java.util.ArrayList;

public class Korpa {

    private ArrayList<Ambalaza> nizAmbalaze = new ArrayList<>();

    public void dodajAmbalazu(Ambalaza a){
        nizAmbalaze.add(a);
    }
    public void izbaciAmbalazu(String barKod){
        nizAmbalaze.remove(barKod);
    }
    private double cenaSaPopustom (int popust){
        double cena = 0;
        for (int i = 0; i < nizAmbalaze.size(); i++) {
           cena = nizAmbalaze.get(i).cenaArtikla() - nizAmbalaze.get(i).cenaArtikla() * (popust/100);
        }
        return cena;
    }
    public double cenaKorpe(SuperKartica superKartica){
        return this.cenaSaPopustom(superKartica.getPopust());
    }
    public void stampaj() {
        System.out.println("Lista artikla u korpi: ");
        for (int i = 0; i < nizAmbalaze.size(); i++) {
            nizAmbalaze.get(i).stampaj();

        }
    }
}

