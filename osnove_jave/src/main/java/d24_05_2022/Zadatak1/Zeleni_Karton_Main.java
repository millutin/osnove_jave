package d24_05_2022.Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

 public class Zeleni_Karton_Main {
     public static void main(String[] args) {

         ArrayList<Zeleni_Karton> predmeti = new ArrayList<Zeleni_Karton>();
         Scanner s = new Scanner(System.in);
         Zeleni_Karton predmet1 = new Zeleni_Karton("Milos Milutinovic",
                 1025,
                 "Matematika",
                 "Marko Markovic",
                 6);

         Zeleni_Karton predmet2 = new Zeleni_Karton("Milos Milutinovic",
                 1025,
                 "Statistika",
                 "Dejan Nenadovic",
                 5);

         Zeleni_Karton predmet3 = new Zeleni_Karton("Milos Milutinovic",
                 1025,
                 "Ekonomija",
                 "Milan Petrovic",
                 9);

         Zeleni_Karton predmet4 = new Zeleni_Karton("Milos Milutinovic",
                 1025,
                 "Sociologija",
                 "Milica Simic",
                 7);

         Zeleni_Karton predmet5 = new Zeleni_Karton("Marko Misic",
                 1087,
                 "Matematika",
                 "Marko Markovic",
                 5);

         Zeleni_Karton predmet6 = new Zeleni_Karton("Marko Misic",
                 1087,
                 "Statistika",
                 "Dejan Nenadovic",
                 9);

         Zeleni_Karton predmet7 = new Zeleni_Karton("Marko Misic",
                 1087,
                 "Sociologija",
                 "Milica Simic",
                 6);

         Zeleni_Karton predmet8 = new Zeleni_Karton("Nemanja Rasic",
                 1044,
                 "Matematika",
                 "Marko Markovic",
                 5);

         Zeleni_Karton predmet9 = new Zeleni_Karton("Nemanja Rasic",
                 1044,
                 "Sociologija",
                 "Milica Simic",
                 10);

         Zeleni_Karton predmet10 = new Zeleni_Karton("Nemanja Rasic",
                 1044,
                 "Statistika",
                 "Dejan Nenadovic",
                 7);

         predmeti.add(predmet1);
         predmeti.add(predmet2);
         predmeti.add(predmet3);
         predmeti.add(predmet4);
         predmeti.add(predmet5);
         predmeti.add(predmet6);
         predmeti.add(predmet7);
         predmeti.add(predmet8);
         predmeti.add(predmet9);
         predmeti.add(predmet10);



         for (int i = 0; i < predmeti.size(); i++) {
             Zeleni_Karton spisak = predmeti.get(i);
             spisak.stampaj();

         }



     }
 }
//        U glavnoj klasi:
//        kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//        (Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//        (Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
//
