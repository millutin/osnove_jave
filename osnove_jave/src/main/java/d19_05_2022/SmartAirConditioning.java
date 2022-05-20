package d19_05_2022;

import javax.lang.model.type.NullType;

public class SmartAirConditioning {

    public String marka;
    public int potrosnjaHladjenje;
    public int potrosnjaGrejanje;
    public int temperatura;
    public String mod; // hladi/greje

    public void stampa (){
        System.out.println(this.marka + " - " + this.mod + " - " + this.temperatura + " 'C ");
    }
    public double mescnaPotrosnja (){
        if (mod.equals("hladi")){
           return  30 * 15 * this.potrosnjaHladjenje;
        }
        if (mod.equals("greje")){
            return  30 * 15 * this.potrosnjaGrejanje;
        }
        return 0;
    }
    public double potrosnjaUNovcu () {
        if (this.mescnaPotrosnja() <= 350){
            return this.mescnaPotrosnja() * 6;
        }else {
            return 350 * 6 + (this.mescnaPotrosnja() - 350) * 9;
        }
    }

}
