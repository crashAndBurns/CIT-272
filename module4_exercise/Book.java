public class Book extends Product {
    // attributes
    String title;
    String author;
    String genre;
    int numPages;
    int year;

    // Empty Constructor
    public Book() {
        this.title = "";
        this. author = "";
        this.genre = "";
        this.numPages = 0;
        this.year = 0;
    }

    // Constructor with all fields    
    public Book(int productID, String name, String description, double price,
        String title, String author, String genre, int numPages, int year) {
        super(productID, name, description, price);
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.numPages = numPages;
        this.year = year;
    }

    // Getters and setters
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumPages() {
        return this.numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        String result = super.toString() + "\n";
        result += "Title: " + this.title + "\n";
        result += "Author: " + this.author + "\n";
        result += "Genre: " + this.genre + "\n";
        result += "Year: " + this.year;

        return result;
    }
}
