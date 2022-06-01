package d31_05_2022.Zadatak1;
//    Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//        godine iskustva
//        tip trenera (kondicioni, za igru, pomocni, personalni)
//        metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.

public class Trener extends Osoba{

    private int godineIskustva;
    private String tipTrenera; // kondicioni, za igru, pomocni, personalni

    public Trener(String punoIme, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
        super(punoIme, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }
    @Override
    public void stampaj(){
       super.stampaj();
        System.out.print("Godine iskustva: " + this.godineIskustva + ",  ");
        System.out.println(this.tipTrenera);

    }
}
