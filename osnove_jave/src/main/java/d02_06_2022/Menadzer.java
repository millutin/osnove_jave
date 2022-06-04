package d02_06_2022;
//    Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//        override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.

import java.util.ArrayList;

public class Menadzer extends Radnik{


    public Menadzer(String imeIPrezime) {
        super(imeIPrezime);
    }

    @Override
    public double plataRadnika() {
        int suma = 0;
        for (int i = 0; i < nizSektora.size(); i++) {
            suma +=  nizSektora.get(i).getPlata();

        }
        return suma;
    }
}
