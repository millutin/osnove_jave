package d31_05_2022.Zadatak1;
//     Kreirati klasu Osoba koja ima:
//        ime i prezime
//        jmbg
//        godinu rodjenja
//     default-ni konstuktor
//        konstuktor sa parametrima
//        gettere i settere
//        metodu stampaj koja stampa u formatu:
//        (ime i prezime), (jmbg), (godina rodjenja)

public class Osoba {
    protected String punoIme;
    protected String jmbg;
    protected int godinaRodjenja;

    public Osoba (){}

    public Osoba(String punoIme, String jmbg, int godinaRodjenja) {
        this.punoIme = punoIme;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }

    public String getPunoIme() {
        return this.punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getJmbg() {
        return this.jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodinaRodjenja() {
        return this.godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }
    public void stampaj(){
        System.out.print(this.punoIme + ", ");
        System.out.print("JMBG:" + this.jmbg + ", ");
        System.out.println("Datum rodjenja: " + this.godinaRodjenja);
    }
}
