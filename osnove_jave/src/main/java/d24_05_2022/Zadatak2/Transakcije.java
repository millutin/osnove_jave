package d24_05_2022.Zadatak2;

public class Transakcije {

    private int id;
    private Racun racunSalje;
    private Racun racunPrima;

    public Transakcije(int id, Racun racunSalje, Racun racunPrima) {
        this.id = id;
        this.racunSalje = racunSalje;
        this.racunPrima = racunPrima;
    }
    public Transakcije (){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Racun getRacunSalje() {
        return this.racunSalje;
    }

    public void setRacunSalje(Racun racunSalje) {
        this.racunSalje = racunSalje;
    }

    public Racun getRacunPrima() {
        return racunPrima;
    }

    public void setRacunPrima( Racun racunPrima) {
        this.racunPrima = racunPrima;
    }
    private double provizija (int transakcija){
        if (transakcija < 4500){
          return  45;
        }else {
           return transakcija / 100;
        }
    }
    public void izvrsiTransakciju (double transakcija){
       if (transakcija + provizija((int) transakcija) < this.racunSalje.getTrenutnoStanjeNaRacunu()){
           this.racunSalje.promenaStanja(transakcija + provizija((int) transakcija));
           this.racunPrima.promenaStanja(-1 * transakcija);
       }

    }
    public void stampaj(){
        System.out.println("ID transakcije: " + this.id);
        System.out.println("Racun posiljioca: " + this.racunSalje.getImeIPrezime() +
                " Broj racuna: " + this.racunSalje.getBrojRacuna());
        System.out.println("Racun primaoca: " + this.racunPrima.getImeIPrezime() +
                " Broj racuna: " + this.racunPrima.getBrojRacuna());
    }
 }




//    id transakcije
//    racun sa kog se prenose sredstva
//    racun na koji se prenose sredstva
//    gettere i settere
//        konstruktore
//    privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//        ako je prenos sredstava manji od 4500, provizija je fiksna 45
//        ako je prenos sredstava veci od 4500, provizija je 1%
//        S obzirom da se provizija racuna na osnovu visine transakcije,
//        znaci da metoda prima parametar koji predstavlja visinu transakcije
//        Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju
//        u vrednosti od 45.
//        metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi.
//        Kao parametar funkcije se unosi vrednost koja se prebacuje.
//        Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija),
//        a na drugi racun dodaje samo (trazena suma).
//        (Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//        metodu koja stampa podatke o transakciji u formatu:
//        id transkacije
//        Racun sa: Ime i prezime  -  broj racuna
//        Racun na: Ime i prezime  -  broj racuna
//
//        Naravno u glavnom kreirati objekte i testirati funkcionalnost
