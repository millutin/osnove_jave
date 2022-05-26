package d23_05_2022.Zadatak2;

import d23_05_2022.Zadatak2.Proizvod;

public class Proizvod_Vaga_Main {
    public static void main(String[] args) {

       Proizvod brasno = new Proizvod("g27", "Projeno brasno", 82);
       Vaga kantar = new Vaga();
       kantar.setMernaJedinica("kg");
       kantar.setProizvod(brasno);
       kantar.stampaj(50);
    }
}
