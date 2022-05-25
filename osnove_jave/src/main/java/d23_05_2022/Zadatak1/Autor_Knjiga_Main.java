package d23_05_2022.Zadatak1;

public class Autor_Knjiga_Main {
    public static void main(String[] args) {

      Autor autor1 = new Autor("Milos Milutinovic");

      Autor autor2 = new Autor("Milan Jovanovic");

      Autor autor3 = new Autor("Vladimir Minic");

//************************************************************
      Knjiga knjiga1 = new Knjiga();
      knjiga1.setIsbn(5258);
      knjiga1.setGodinaIzdanja(2017);
      knjiga1.setNaziv("Kako sam postao QA manuelni tester");
      knjiga1.setAutor(autor1);

        Knjiga knjiga2 = new Knjiga();
        knjiga2.setIsbn(1052);
        knjiga2.setGodinaIzdanja(2022);
        knjiga2.setNaziv("Moje muke sa grupom IX");
        knjiga2.setAutor(autor2);

        Knjiga knjiga3 = new Knjiga();
        knjiga3.setIsbn(6971);
        knjiga3.setGodinaIzdanja(2022);
        knjiga3.setNaziv("Moje muke sa Autorom 2");
        knjiga3.setAutor(autor3);

        knjiga1.stampaj();
        System.out.println();
        knjiga2.stampaj();
        System.out.println();
        knjiga3.stampaj();
    }
}
//    Kreirati klasu Autor koja ima
//        -ime i prezime
//        -konstuktore koje mislite da su vam potrebni
//        -gettere i settere za atribute
//        -metodu print koja stampa u formatu:
//        (ime autora) (prezime autora)
//
//        Kreirati klasu Knjiga koji ima:
//        -ISBN
//        -naziv
//        -godina izdanja
//        -autor
//        -konstuktore koje mislite da su vam potrebni
//        -gettere i settere za atribute
//        -metodu print koja stampa u formatu (izbegavati dupliranje koda):
//        (ISBN)
//        (naziv) - (godina izdanja)
//        autor: (ime autora) (prezime autora)
//
//        U glavnom programu napraviti vise autora sa vise knjiga.
