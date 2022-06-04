package d03_06_2022;
//Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//kaucija za flasu
//atribut koji kaze da li se za flasu placa kaucija
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu
//ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//ako se ne placa, (osnovna cena) * 1.2
//metoda stampaj stampa sve podatke iz klase staklena flasa.

public class StaklenaAmbalaza extends Ambalaza{
    private int kaucija;
    private boolean kaucijaIde;
    private int osnovnaCena;



    public StaklenaAmbalaza(String barKod, String nazivArtikla, int netoTezina, int brutoTezina, int kaucija, boolean kaucijaIde, int osnovnaCena) {
        super(barKod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.kaucijaIde = kaucijaIde;
        this.osnovnaCena = osnovnaCena;
    }

    public int getKaucija() {
        return kaucija;
    }

    public void setKaucija(int kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isKaucijaIde() {
        return kaucijaIde;
    }

    public void setKaucijaIde(boolean kaucijaIde) {
        this.kaucijaIde = kaucijaIde;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public int cenaArtikla() {
        if (this.kaucijaIde == true){
            return (int) (this.osnovnaCena * 1.2 + this.kaucija);
        }else {
            return (int) (this.osnovnaCena * 1.2);
        }
    }

    @Override
    public void stampaj() {
        System.out.println(this.nazivArtikla);
        System.out.println("Bar kod: " + this.barKod + ", Osnovna cena: " + this.osnovnaCena);
        System.out.println("Bruto: " + this.brutoTezina + ", Neto: " + this.netoTezina);
        if (this.kaucijaIde == true){
            System.out.println("Naplacuje se kaucija: " + this.kaucija + " dinara");

        }else {
            System.out.println("Nema kauciju.");
        }

    }

}
