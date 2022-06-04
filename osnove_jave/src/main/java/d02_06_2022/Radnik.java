package d02_06_2022;
//     Kreirati abstraktnu klasu Radnik koja ima:
//        ime i prezime
//        niz sektora u kojima radi
//        abstraktnu metodu koja vraca platu radnika
//        metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

import java.util.ArrayList;

public abstract class Radnik {
    protected String imeIPrezime;
    protected ArrayList<Sektor> nizSektora = new ArrayList<Sektor>();

    public Radnik(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;

    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public ArrayList<Sektor> getNizSektora() {
        return nizSektora;
    }

    public void setNizSektora(ArrayList<Sektor> nizSektora) {
        this.nizSektora = nizSektora;
    }

    public abstract double plataRadnika();

    public void zaposliUSektor (Sektor sektor){
       this.nizSektora.add(sektor);
    }
}
