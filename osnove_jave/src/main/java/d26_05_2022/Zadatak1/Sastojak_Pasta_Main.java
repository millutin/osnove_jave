package d26_05_2022.Zadatak1;

import java.util.ArrayList;

public class Sastojak_Pasta_Main {
    public static void main(String[] args) {

        Sastojak s1 = new Sastojak("Kecap", 55 );
        Sastojak s2 = new Sastojak("Majonez", 75);
        Sastojak s3 = new Sastojak("Pavlaka",125);




        Pasta night = new Pasta();
            night.dodajSastojak(s1);
            night.dodajSastojak(s2);
            night.dodajSastojak(s3);

            night.stampajPasta();






    }
}
