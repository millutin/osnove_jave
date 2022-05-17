package d16_05_2022;
//        Zadatak
//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.

public class zadatak3 {
    public static void main(String[] args) {

        podaciOKorisniku("0312985730018", "Milos", "Milutinovic", 1985, true);


    }
    static void podaciOKorisniku(String jmbg, String ime, String prezime, int godinaRodjenja, boolean aktivan){
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Godina rodjenja: " + godinaRodjenja);
        System.out.println("Aktivan: " + aktivan);

    }
}
