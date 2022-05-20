package d18_05_2022;
//Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//        cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//        i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.

public class Proizvod_main {
    public static void main(String[] args) {


    Proizvod Pljeskavica = new Proizvod();
    Pljeskavica.naziv = "Gurmanska";
    Pljeskavica.cena = 300;
    Pljeskavica.tezina = 250;

    Proizvod Pizza = new Proizvod();
    Pizza.naziv = "Kapicoza";
    Pizza.cena = 650;
    Pizza.tezina = 500;


    Pljeskavica.stampaj();
    Pizza.stampaj();


    }
}



//    public static void main(String[] args) {
//
//        Proizvod artikal = new Proizvod();
//
//        artikal.stampaj = myMethod(artikal.naziv, artikal.cena, artikal.tezina);
//        System.out.println(artikal.stampaj);
//    }
//    static String myMethod(String naziv, double cena, double tezina){
//
//        naziv = "Gurmanska";
//        cena = 250;
//        tezina = 220;
//        String stampaj = naziv + " , Cena; "+ cena +" , Tezina; "+ tezina;
//        return stampaj;
