package d18_05_2022;

public class SmartAirConditioning_main {
    public static void main(String[] args) {

        SmartAirConditioning obicnaKlima = new SmartAirConditioning();

        obicnaKlima.maraka = "Midea";
        obicnaKlima.temperatura = 20;
        obicnaKlima.mod = "hladi";

        SmartAirConditioning inverterKlima = new SmartAirConditioning();

        inverterKlima.maraka = "Gree";
        inverterKlima.temperatura = 30;
        inverterKlima.mod = "greje";

        obicnaKlima.stampa();
        inverterKlima.stampa();

    }
}
