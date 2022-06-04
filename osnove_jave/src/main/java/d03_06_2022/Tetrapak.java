package d03_06_2022;
//    Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//        atribut koji kaze da li se moze reciklirati
//        osnovna cena
//        gettere i setter za atribute
//        konstuktori koji su vam potrebni
//        racuna cenu tako da ispunjava uslova:
//        ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 +
//        (osnovna cena);
//        ako nije u cenu ulazi samo osnovna cena
//        metoda stampaj stampa sve podatke iz klase tetrapak.

public class Tetrapak extends Ambalaza{

    private boolean daLiSeReciklira;
    private int osnovaCena;



    public Tetrapak(String barKod, String nazivArtikla, int netoTezina,
                    int brutoTezina, boolean daLiSeReciklira, int osnovaCena) {
        super(barKod, nazivArtikla, netoTezina, brutoTezina);
        this.daLiSeReciklira = daLiSeReciklira;
        this.osnovaCena = osnovaCena;
    }

    public boolean isDaLiSeReciklira() {
        return daLiSeReciklira;
    }

    public void setDaLiSeReciklira(boolean daLiSeReciklira) {
        this.daLiSeReciklira = daLiSeReciklira;
    }

    public int getOsnovaCena() {
        return osnovaCena;
    }

    public void setOsnovaCena(int osnovaCena) {
        this.osnovaCena = osnovaCena;
    }

    @Override
    public int cenaArtikla() {
        if (this.daLiSeReciklira == true){
            return (int) (tezinaPakovanja() * 1.5 + this.osnovaCena);
        }else {
            return this.osnovaCena;
        }
    }

    @Override
    public void stampaj() {
        System.out.println(this.nazivArtikla);
        System.out.println("Bar kod: " + this.barKod + ", Osnovna cena: " + this.osnovaCena);
        System.out.println("Bruto: " + this.brutoTezina + ", Neto: " + this.netoTezina);
        if (this.daLiSeReciklira == true){
            System.out.println("Reciklira se.");
        }else {
            System.out.println("Nije za reciklazu.");
        }

    }
}
