package d24_05_2022.Zadatak2;

public class Racun {
    private String brojRacuna;
    private String imeIPrezime;
    private int stanjeNaRacunu; // npr:100, 1220


    public Racun(String brojRacuna, String imeIPrezime, int trenutnoStanjeNaRacunu) {
        this.brojRacuna = brojRacuna;
        this.imeIPrezime = imeIPrezime;
        this.stanjeNaRacunu = trenutnoStanjeNaRacunu;
    }
    public Racun (){}

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getTrenutnoStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void promenaStanja(double transakcija){
        if (transakcija < this.stanjeNaRacunu ){
            this.stanjeNaRacunu = (int) (this.stanjeNaRacunu - transakcija);
        }else {
            this.stanjeNaRacunu = this.stanjeNaRacunu - 0;
        }
    }
    public void stampaj (){
        System.out.println(this.imeIPrezime + " - " + this.brojRacuna);
        System.out.println("Stanje na racunu je: " + this.stanjeNaRacunu + " dinara.");
    }
}
//    Kreirati klasu Racun koja ima:
//        broj racuna (npr: 170-289328923-23)
//        ime i prezime osobe
//        trenutno stanje na racunu (npr: 100, 1220)
//        gettere i setter za sve atribute, sem settera za stanje na racunu
//        metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
//        metodu koja stampa podatke o racunu u formatu:
//        Ime i prezime  -  broj racuna
//        stanje na racunu je (trenutno stanje) rsd.
