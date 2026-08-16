public class Author {
    private String firstName;
    private String lastName;
    private String author;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.author = firstName + " " + lastName;
    }

    public String getAuthor() {
        return this.author;
    }
}
