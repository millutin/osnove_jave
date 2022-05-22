package d20_05_2022;

public class Main_FacebookPost {
    public static void main(String[] args) {

      FacebookPost PrviPost = new FacebookPost();

      PrviPost.imeIPrezimeKoJeObjavioPost = "Tyrion Lannister";
      PrviPost.imeIPrezimeCijiJeProfil = "Jon Snow";
      PrviPost.tekstObjave = "Winter is coming. White walkers will rise.";
      PrviPost.brojLajkova = 755;
      PrviPost.brojSherova = 24;
      PrviPost.print();
      PrviPost.like();
      PrviPost.like();
      PrviPost.shere();
      PrviPost.shere();
      PrviPost.print();
      PrviPost.dislike();
      PrviPost.print();

        System.out.println();

        FacebookPost DrugiPost = new FacebookPost("Melisandre","Arya Stark",
                "What do we say to the God of Death?");
        DrugiPost.print();
        DrugiPost.like();
        DrugiPost.like();
        DrugiPost.shere();
        DrugiPost.shere();
        DrugiPost.print();
        DrugiPost.dislike();
        DrugiPost.print();





    }
}
