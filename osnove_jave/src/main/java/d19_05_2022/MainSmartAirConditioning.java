package d19_05_2022;

public class MainSmartAirConditioning {
    public static void main(String[] args) {

        SmartAirConditioning Klima = new SmartAirConditioning();

        Klima.marka = "Gree";
        Klima.mod = "hladi";
        Klima.temperatura = 19;
        Klima.potrosnjaHladjenje = 1;
        Klima.potrosnjaGrejanje = 2;

        Klima.stampa();

        System.out.println("Mesecna potrosnja je: " + Klima.mescnaPotrosnja() + " kw");
        System.out.println("Cena za utrosenu elektricnu energiju je: " + Klima.potrosnjaUNovcu());

//******************************************************************************************
        System.out.println();

        SmartAirConditioning InverterKlima = new SmartAirConditioning();

        InverterKlima.marka = "Gree";
        InverterKlima.mod = "greje";
        InverterKlima.temperatura = 26;
        InverterKlima.potrosnjaHladjenje = 1;
        InverterKlima.potrosnjaGrejanje = 2;

        InverterKlima.stampa();

        System.out.println("Mesecna potrosnja je: " + InverterKlima.mescnaPotrosnja() + " kw");
        System.out.println("Cena za utrosenu elektricnu energiju je: " + InverterKlima.potrosnjaUNovcu());

    }
}
