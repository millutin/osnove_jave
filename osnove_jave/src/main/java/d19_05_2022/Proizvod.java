package d19_05_2022;

public class Proizvod {

    public String naziv;
    public double cena;
    public double tezina; // u gramima


    public void stampaj() {
        System.out.println(this.naziv + " , " + this.cena + " din. , " + this.tezina + " g");
    }

    public void povecajCenu(int povecanje) {
        this.cena = this.cena + povecanje;
    }

    public double vratiCenuSaPopustom(double popust) {
        return  cena - cena * popust / 100;
    }

    public double racunajPostarinu() {
          double cenaPostarine = 0;
          if (this.tezina <=100 ){
              return cenaPostarine = 200;
          } else if (this.tezina >100 && this.tezina <=500) {
              return cenaPostarine = 400;
          } else if (this.tezina > 500) {
              return cenaPostarine = 1000;
          }
         return 0;
    }


}
