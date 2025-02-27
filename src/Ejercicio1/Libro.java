package Ejercicio1;

public class Libro {

    public enum Format {

        POCKET, HARDCOVER, SOFTCOVER

    }

    private final String isbn;
    private final String name;
    private final String author;
    private int pageCount;
    private String genre;
    private Format format;

    // Constructor

    public Libro(String isbn, String name, String author, int pageCount, String genre, Format format) {

        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.pageCount = pageCount;
        this.genre = genre;
        this.format = format;

    }

    public Libro() {

        this.isbn = "";
        this.name = "";
        this.author = "";
        this.pageCount = 0;
        this.genre = "";
        this.format = Format.HARDCOVER;

    }

    // Methods

    @Override
    public String toString() {

        return this.name + ", " + this.author + ", Peso: " + this.calcWeight() + "g.";

    }

    public int calcWeight(){

        int weight;

        if (this.format == Format.HARDCOVER){

            weight = 50;
            weight += pageCount * 2;

        } else if (this.format == Format.SOFTCOVER) {

            weight = 20;
            weight += pageCount * 2;

        } else {

            weight = 10;
            weight += pageCount;

        }

        return weight;

    }

    // Getters & Setters

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }
}
