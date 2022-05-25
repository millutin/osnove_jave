package d23_05_2022.Zadatak1;

public class Autor {

    private String imeIPrezime;

    public Autor(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public Autor (){

    }

    public String getAutor() {
        return this.imeIPrezime;
    }

    public void setAutor(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public void stampaj (){
        System.out.println("Autor: " + this.imeIPrezime);
    }
}
