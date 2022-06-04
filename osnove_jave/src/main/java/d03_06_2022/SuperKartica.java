package d03_06_2022;
//      Kreirati klasu SuperKartica koja ima:
//        broj kartice
//        ime i prezime vlasnika
//        popust (200, 500, … )
//        konstuktore (default-ni i sa parametrima)
//        gettere i settere
//        metodu stampaj koja stampa karticu u formatu:
//        (broj kartice), (ime i prezime)

public class SuperKartica {

    private int brojKartice;
    private String punoImeVlasnika;
    private int popust; // 200,500, ....

    public SuperKartica (){}

    public SuperKartica(int brojKartice, String punoImeVlasnika, int popust) {
        this.brojKartice = brojKartice;
        this.punoImeVlasnika = punoImeVlasnika;
        this.popust = popust;
    }

    public int getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(int brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getPunoImeVlasnika() {
        return punoImeVlasnika;
    }

    public void setPunoImeVlasnika(String punoImeVlasnika) {
        this.punoImeVlasnika = punoImeVlasnika;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }
    public void stampaj(){
        System.out.println("Br.Kartice: " + this.brojKartice + ",  Ime i prezime vlasnika: " + this.punoImeVlasnika);
    }
}
