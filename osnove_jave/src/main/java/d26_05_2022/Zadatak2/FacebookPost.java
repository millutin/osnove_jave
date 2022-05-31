package d26_05_2022.Zadatak2;

import java.util.ArrayList;

//        ime i prezime korisnika koji je stavio oglas
//        tekst objave
//        niz reakcija
//        metodu reaguj, koja dodaje reakciju u niz
//        (modifikacija za vezbu) Ukoliko se desi situacija da jedan isti korisnik reaguje na post (tj. postoji rekacija korisnika sa istim imenom i prezimenom) izbaciti prethodnu reakciju i uracunati novu.
//        Primer: Milan - lajkuje
//        Nemanja - lajkuje
//        Milan - daje srce
//        Post ima lajk od Nemanje i srce od Milana.
//        privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
//        metodu stampaj koja stampa podatke u formatu:
//        ime i prezime
//        tekst objave
//        Smajli 10 | Like 15 | Srce 2
public class FacebookPost {

    private String punoImeKoJeStavioOglas;
    private String textObjave;
    private ArrayList <Reakcija> nizReakcija = new ArrayList <>();

    public FacebookPost(String punoImeKoJeStavioOglas, String textObjave) {
        this.punoImeKoJeStavioOglas = punoImeKoJeStavioOglas;
        this.textObjave = textObjave;
    }
    public void dodajReakciju(Reakcija reakcija){
        this.nizReakcija.add(reakcija);
    }
//    public void izbaciReakciju (Reakcija reakcija){
//        for (int i = 0; i < nizReakcija.size(); i++) {
//            if (this.nizReakcija.get(i).getReakcijaKorisnika().equals(reakcija.getReakcijaKorisnika())){
//                nizReakcija.remove(i);
//            }
//        }
//        this.nizReakcija.add(reakcija);
//    }
    private int brojReakcija (String tipReakcije){
        int brojac = 0;
        for (int i = 0; i < this.nizReakcija.size(); i++) {
            if (this.nizReakcija.get(i).getTipReakcije().equals(tipReakcije)){
                brojac++;
            }
        }
        return brojac;
    }
    public void stampaj(){
        System.out.println(this.punoImeKoJeStavioOglas);
        System.out.println(this.textObjave);
        System.out.print(" Smajli " + this.brojReakcija("smajli"));
        System.out.print(" Srce " + this.brojReakcija("srce"));
        System.out.println(" Lajk " + this.brojReakcija("lajk"));
        System.out.println();
    }
}
