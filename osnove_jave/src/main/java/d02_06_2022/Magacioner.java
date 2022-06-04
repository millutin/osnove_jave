package d02_06_2022;
//    Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:



import java.util.ArrayList;

public class Magacioner extends Radnik{


    public Magacioner(String imeIPrezime) {
        super(imeIPrezime);
    }

//        ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//        suma plata svih sektor / broj sektora * 0.5

    private double prosecnaPlata() {
        double prosecnaPlata = 0;
        int x = 0;
        double y = 0;
        for (int i = 0; i < nizSektora.size(); i++) {
                x++;
                y = prosecnaPlata + nizSektora.get(i).getPlata();
        }
        return (y / x) * 0.5;
    }



    //         Overriduje metodu za platu, tako da se plata racuna po formuli:
//        (prosecna plata za sve sektore u kojima radi) * (broj sektora).
    @Override
    public double plataRadnika() {
        int x = 0;
        for (int i = 0; i < nizSektora.size(); i++) {
                x++;
        }
        return this.prosecnaPlata() * x;
    }
}






