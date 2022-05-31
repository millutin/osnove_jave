package d26_05_2022.Zadatak1;

import java.util.ArrayList;

public class Pasta {

    private ArrayList <Sastojak> s = new ArrayList <Sastojak>();

    public Pasta(){}



    public ArrayList<Sastojak> getS() {
        return s;
    }



    public void dodajSastojak (Sastojak s){
        this.s.add(s);
    }
    public double cenaPaste (){
        double cena = 0;
        for (int i = 0; i < s.size(); i++) {
            cena = cena + s.get(i).getCena();
        }
        return cena;
    }
    public void ukloniSastojak(String sastojak){

        for (int i = 0; i < s.size(); i++) {
            if (sastojak.equals(this.s.get(i).getNaziv())){
                this.s.remove(sastojak);
            }
        }
    }
   public void stampajPasta (){
       System.out.println("Pasta je sa sastojcima:");
       for (int i = 0; i < this.s.size(); i++) {
           System.out.println(this.s.get(i).getNaziv() + " - " + this.s.get(i).getCena() + " dinara");

       }
       System.out.println("Cena paste je: " + this.cenaPaste() + " dinara");
   }


}
//    Kreirati klasu Pasta koja ima:
//        niz sastojaka
//        metodu za dodavanje sastojka
//        (ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.
//        defaultni konstruktor
//        metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//        metodu za stampu koja stampa podatke u formatu:
//        Pasta je sa sastojcima:
//        naziv - cena.din
//        naziv - cena.din
//        naziv - cena.din
//        Cena paste je cena.din
