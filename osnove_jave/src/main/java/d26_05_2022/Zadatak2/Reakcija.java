package d26_05_2022.Zadatak2;
//     Kreirati klasu Reakcija koja ima
//     tip reakcije (smajli, like, srce)
//     ime i prezime korisnika koji je reagovao
//     gettere, settere i konstruktore
public class Reakcija {
    private String tipReakcije;
    private String reakcijaKorisnika;

    public Reakcija(){}

    public Reakcija(String tipReakcije, String punoImeKorisnika) {
        this.tipReakcije = tipReakcije;
        this.reakcijaKorisnika = punoImeKorisnika;
    }

    public String getTipReakcije() {
        return tipReakcije;
    }

    public void setTipReakcije(String tipReakcije) {
        this.tipReakcije = tipReakcije;
    }

    public String getReakcijaKorisnika() {
        return reakcijaKorisnika;
    }

    public void setReakcijaKorisnika(String reakcijaKorisnika) {
        this.reakcijaKorisnika = reakcijaKorisnika;
    }
}
