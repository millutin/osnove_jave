package d23_05_2022.Zadatak2;

public class Vaga {
   private String mernaJedinica;
   private Proizvod proizvod;

   public Vaga (){}

    public String getMernaJedinica() {
        return this.mernaJedinica;
    }

    public void setMernaJedinica(String mernaJedinica) {
        this.mernaJedinica = mernaJedinica;
    }

    public Proizvod getProizvod() {
        return this.proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public double srecunajCenu (double tezina){
       if (mernaJedinica.equals("lb")){
           return this.proizvod.getCenaLb() * tezina;
       } else {
           return this.proizvod.getCenaKg() * tezina;
       }
    }
    public void stampaj (double tezina) {
        System.out.println(this.proizvod.getSifraProizvoda() + " - " +
                this.proizvod.getNazivProizvoda());
        if (mernaJedinica.equals("lb")) {
            System.out.println("Cena: " + this.proizvod.getCenaLb() +
                    " Merna jednica: " + this.mernaJedinica + " x " + tezina );
        } else {
            System.out.println("Cena: " + this.proizvod.getCenaKg() +
                    " Merna jednica: " + this.mernaJedinica + " x " + tezina);
        }
        System.out.println("Ukupno: " + this.srecunajCenu(50));
    }
}
//    Kreirati klasu Vaga koja ima:
//    merna jedinica (kg ili lb)
//    proizvod (proizvod koji se meri)
//    TEZINA SE NE CUVA KAO ATRIBUT!!!!!!!!!
//    default-ni konstuktor
//    getteri i setteri za sve atribute
//    metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu
//    (tezina je parametar funkcije).
//    Na racunanje cene utice i merna jedinica na koju je vaga podesena.
//    metodu stampaj koja stampa racun u formatu.
//    POMOC: trebace vam tezina kao parametar u ovoj metodi
//   (sifra) - (naziv)
//   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina)
//    Ukupno: (ukupna cena)