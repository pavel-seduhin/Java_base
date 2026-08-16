public class Book {
    private String  name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getBook(){
        return (this.name + " " + this.author + " " + this.year);
    }

    public void setYear(int year) {
        this.year = year;
    }
}
