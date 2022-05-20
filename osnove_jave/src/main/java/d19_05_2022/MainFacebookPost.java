package d19_05_2022;

public class MainFacebookPost {
    public static void main(String[] args) {

        FacebookPost PrviKomentar = new FacebookPost();

        PrviKomentar.imeIPrezime = "Milos Milutinovic";
        PrviKomentar.imeKorisnikaProfila = "Bora Djordjevic";
        PrviKomentar.textObjave = "Dok stojim za sankom delimicno pijan, mrzeci po malo i sebe i druge....";
        PrviKomentar.brojLajkova = 1;
        PrviKomentar.brojDeljenja = 1;
        PrviKomentar.stampa();

        PrviKomentar.like();
        PrviKomentar.like();
        PrviKomentar.like();
        System.out.println("Stampa nakon 3 nova lajka");
        PrviKomentar.stampa();

        PrviKomentar.share();
        PrviKomentar.share();
        System.out.println("Stampa nakon dva nova shera");
        PrviKomentar.stampa();

        PrviKomentar.dislike();
        System.out.println("Stampa nakon jednog dislajka");
        PrviKomentar.stampa();

//******************************************************************************
        System.out.println();


        FacebookPost DrugiKomentar = new FacebookPost();

        DrugiKomentar.imeIPrezime = "Milos Milutinovic";
        DrugiKomentar.imeKorisnikaProfila = "Vera Matovic";
        DrugiKomentar.textObjave = "Miki Milane, bas mi ne das mira.....";
        DrugiKomentar.brojLajkova = 1;
        DrugiKomentar.brojDeljenja = 1;
        DrugiKomentar.stampa();

        DrugiKomentar.share();
        DrugiKomentar.share();
        DrugiKomentar.share();
        System.out.println("Stampa nakon 3 shera");
        DrugiKomentar.stampa();

        DrugiKomentar.like();
        DrugiKomentar.like();
        System.out.println("Stampa nakon 2 lajka");
        DrugiKomentar.stampa();

        DrugiKomentar.dislike();
        System.out.println("Stampa nakon jednog dislajka");
        DrugiKomentar.stampa();
    }
}
