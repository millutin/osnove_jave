package d30_05_2022.Zadatak1;

public class IspitStudent_Main {
    public static void main(String[] args) {



        Student student = new Student(12345,"Milos Milutinovic","Osnovne");

        student.dodajIspit(new Ispit("Matematika",5,"Marko Markovic"));
        student.dodajIspit(new Ispit("Engleski",7,"Milica Pejcic"));
        student.dodajIspit(new Ispit("Filozofija",6,"Dragan Jovanovic"));
        student.dodajIspit(new Ispit("Sociologija",9,"Milena Mladenovic"));


        student.stampaj();

    }
}
