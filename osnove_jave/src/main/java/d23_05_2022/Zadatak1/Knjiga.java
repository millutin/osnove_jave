package d23_05_2022.Zadatak1;

import d23_05_2022.Zadatak1.Autor;

public class Knjiga {

    private int isbn;
    private String naziv;
    private int godinaIzdanja;
    private Autor autor;

    public Knjiga(int isbn, String naziv, int godinaIzdanja, Autor autor) {
        this.isbn = isbn;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
        this.autor = autor;
    }
    public Knjiga (){

    }

    public int getIsbn() {
        return this.isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaIzdanja() {
        return this.godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void stampaj (){
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Naziv knjige: " + this.naziv + " - Godina izdanja: " + this.godinaIzdanja);
        System.out.println("Autor: " + this.autor.getAutor());
    }

}
