package d20_05_2022;

public class FacebookPost {

    public String imeIPrezimeKoJeObjavioPost;
    public String imeIPrezimeCijiJeProfil;
    public String tekstObjave;
    public int brojLajkova;
    public int brojSherova;

    public FacebookPost(){

    }
    public FacebookPost(String imeIPrezimeKoJeObjavioPost,
                        String imeIPrezimeCijiJeProfil, String tekstObjave){
       this.imeIPrezimeCijiJeProfil = imeIPrezimeCijiJeProfil;
       this.imeIPrezimeKoJeObjavioPost = imeIPrezimeKoJeObjavioPost;
       this.tekstObjave = tekstObjave;
    }

    public void like(){
        this.brojLajkova = this.brojLajkova + 1;
    }
    public void dislike (){
        this.brojLajkova = this.brojLajkova - 1;
        if (this.brojLajkova < 0){
            this.brojLajkova = 0;
        }
    }
    public void shere (){
        this.brojSherova = this.brojSherova + 1;

    }
    public void print (){
        System.out.println(this.imeIPrezimeKoJeObjavioPost + ">>>"+ this.imeIPrezimeCijiJeProfil);
        System.out.println(this.tekstObjave);
        System.out.println("Likes "+ this.brojLajkova + " | Shares " + brojSherova);
    }


}
