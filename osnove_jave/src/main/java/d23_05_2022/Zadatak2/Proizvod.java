package d23_05_2022.Zadatak2;

public class Proizvod {
    private String sifraProizvoda;
    private String nazivProizvoda;
    private double cenaPoKilogramu;

    public Proizvod(String sifraProizvoda, String nazivProizvoda, double cenaPoKilogramu) {
        this.sifraProizvoda = sifraProizvoda;
        this.nazivProizvoda = nazivProizvoda;
        this.cenaPoKilogramu = cenaPoKilogramu;
    }
    public Proizvod (){}

    public String getSifraProizvoda() {
        return this.sifraProizvoda;
    }

    public void setSifraProizvoda(String sifraProizvoda) {
        this.sifraProizvoda = sifraProizvoda;
    }

    public String getNazivProizvoda() {
        return this.nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public void setCenaPoKilogramu(double cenaPoKilogramu) {
        this.cenaPoKilogramu = cenaPoKilogramu;
    }
    public double getCenaKg(){
        return this.cenaPoKilogramu;
    }
    public double getCenaLb (){
        return this.cenaPoKilogramu * 2.2046;
    }
    public void stampaj(){
        System.out.println(this.sifraProizvoda + " - " + this.nazivProizvoda);
    }

}
//        Kreirati klasu Proizvod koja ima:
//        sifru proizvoda
//        naziv proizvoda
//        cenu po kilogramu (cena po funti se ne cuva, ona se racuna)
//        konstuktor koji prima sva tri parametra (sifra, naziv, cena po kilogramu)
//        gettere i settere za sifru i naziv
//        setter za cenu po kilogramu
//        metodu getCenaKg koja vraca cenu za 1 kg proizvoda
//        metodu getCenaLb koja vraca cenu za 1lb prozvoda
//        konverzija: 1 kg = 2.2046 lb
//        metodu koja stampa proizvod u formatu:
//        (sifra) - (naziv)
