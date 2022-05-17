package d16_05_2022;
//Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
// Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

public class zadatak1 {
    public static void main(String[] args) {
        int broj = 10;
        stampajVrednostZa10Vecu(broj);
    }

    static void stampajVrednostZa10Vecu(int a){
        a = a + 10;
        System.out.println(a);
    }

}
