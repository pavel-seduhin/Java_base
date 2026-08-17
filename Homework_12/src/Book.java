public class Book {
    private String  name;
    private String firstName;
    private String lastName;
    private int year;

    String author;

    public Book(String name, String firstName, String lastName, int year) {
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.author = this.firstName + " " + this.lastName;
    }

    public String getName(){
        return this.name;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}