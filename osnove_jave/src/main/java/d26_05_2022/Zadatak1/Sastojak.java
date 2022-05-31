package d26_05_2022.Zadatak1;

public class Sastojak {
    private String naziv;
    private int cena;

    public Sastojak(){super();}

    public Sastojak(String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCena() {
        return this.cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
    public void stampaj(){
        System.out.println(this.naziv + " - " + this.cena + ".din");
    }

}
//    Kreirati klasu Sastojak koja ima:
//        naziv
//        cenu
//        gettere i settere
//        konstruktore
//        metodu za stampanje koja stampa  podatke u formatu:
//        naziv - cena.din
