package d24_05_2022.Zadatak1;

public class Zeleni_Karton {
    private String imeIPrezime;
    private int brojIndeksa;
    private String nazivPredmeta;
    private String imeIPrezimeProfesora;
    private int ocena; //od 5 do 10;

    public Zeleni_Karton(String imeIPrezime, int brojIndeksa, String nazivPredmeta, String imeIPrezimeProfesora, int ocena) {
        this.imeIPrezime = imeIPrezime;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
        this.ocena = ocena;
    }
    public Zeleni_Karton (){}   //difoltni konstruktor

    public String getImeIPrezime() {
        return this.imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojIndeksa() {
        return this.brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getNazivPredmeta() {
        return this.nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getImeIPrezimeProfesora() {
        return this.imeIPrezimeProfesora;
    }

    public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }

    public int getOcena() {
        return this.ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String daLiJeIspitPolozen (int ocena){
        if (this.ocena > 5){
            return "Polozio je";
        }else {
            return "Nije polozio";
        }
    }
    public void stampaj (){
        System.out.println(this.nazivPredmeta + " - " + this.ocena);
        System.out.println("Student: " + this.imeIPrezime + " , " +this.brojIndeksa);
        System.out.println("Profesor: " + imeIPrezimeProfesora);
    }
}
//    Kreirati klasu ZeleniKarton koja ima:
//        ime i prezime studenta
//        broj indeksa
//        naziv predmeta
//        ime i prezime profesora
//        ocenu - od 5 do 10
//        gettere i settere
//        konstruktore
//        metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//        metodu stampaj koja stampa podatke u formatu:
//        (naziv predmeta) - (ocena)
//        Student: ime i prezime, broj indeksa
//        Profesor: ime i prezime
//
