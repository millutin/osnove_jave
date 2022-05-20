package d19_05_2022;

public class FacebookPost {

    public String imeIPrezime;
    public String  imeKorisnikaProfila;

    public String textObjave;
    public int brojLajkova;
    public int brojDeljenja;

    public void like (){
        this.brojLajkova = this.brojLajkova + 1;
    }
    public void dislike (){
        this.brojLajkova =  this.brojLajkova - 1;
        if (this.brojLajkova < 0){
            this.brojLajkova = 0;
        }

    }
    public void share (){
        this.brojDeljenja = this.brojDeljenja + 1;
    }
    public void stampa (){
        System.out.println(this.imeIPrezime + " >>> " + this.imeKorisnikaProfila);
        System.out.println(this.textObjave);
        System.out.println("Likes " + this.brojLajkova + " | Shares " + this.brojDeljenja);

    }

}
