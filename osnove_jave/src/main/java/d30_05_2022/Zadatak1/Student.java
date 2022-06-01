package d30_05_2022.Zadatak1;
//        broj indeksa
//        ime i prezime
//        tip studija (osnovne, master, doktorske)
//        niz ispita
//        konstuktore koje mislite da ce vam trebati
//        gettere i settere za indeks, ime i prezime, tip studija
//        getter za niz predmeta
//        metodu dodaj ispit u niz ispita
//        metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//        metodu stampaj koja stampa u formatu:
//        (broj indeksa) - (ime i prezime) - (tip studija)
//        Predmeti:
//        (naziv predmeta) - (profesor) - (ocena)
//        (naziv predmeta) - (profesor) - (ocena)
//        (naziv predmeta) - (profesor) - (ocena)
//        Prosecna ocena: (prosecna ocena)

import java.util.ArrayList;

public class Student {
    private int brojIndeksa;
    private String imeIPrezime;
    private String tipStudija; //(osnovne, master, doktorske)
    private ArrayList<Ispit> nizIspita = new ArrayList<>();

    public Student() {
    }

    public Student(int brojIndeksa, String imeIPrezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getNizIspita() {
        return nizIspita;
    }

    public void dodajIspit(Ispit ispit) {
        nizIspita.add(ispit);
    }
//        metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)

    public double prosek() {
        int polozeniIspiti = 1;
        int suma = 0;
        for (int i = 0; i < this.nizIspita.size(); i++) {
            if (this.nizIspita.get(i).getOcena() > 5) {
                suma = suma + this.nizIspita.get(i).getOcena();
                polozeniIspiti++;
                return suma / polozeniIspiti ;
            }
        }


        return 0;
    }


    public void stampaj() {
        System.out.println(brojIndeksa + " - " + imeIPrezime + " - " + tipStudija);
        System.out.println("Predmeti:");
        for (int i = 0; i < nizIspita.size(); i++) {
            System.out.print(nizIspita.get(i).getNazivPredmeta() + " - ");
            System.out.print(nizIspita.get(i).getImeIPrezimeProfesora() + " - ");
            System.out.println(nizIspita.get(i).getOcena());
        }
        System.out.println(prosek());
    }


}
