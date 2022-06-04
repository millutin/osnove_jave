package d02_06_2022;
//      Kreirati klasu Sektor koja ima:
//        naziv sektora
//        platu koja je za taj sektor

public class Sektor {
    private String naziv;
    private int plata;

    public Sektor(String naziv, int plata) {
        this.naziv = naziv;
        this.plata = plata;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getPlata() {
        return plata;
    }
}
