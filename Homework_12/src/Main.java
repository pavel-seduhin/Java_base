//Домашняя работа 12

public class Main {
    public static void main(String[] args) {

        Author dostoevsky = new Author("Фёдор", "Достоевский");
        Book idiot = new Book("Идиот", dostoevsky.getAuthor(), 1984);
        System.out.println(idiot.getBook());

        Author tolstoy = new Author("Лев", "Толстой");
        Book voinaIMir = new Book("Война и мир", tolstoy.getAuthor(), 1975);
        System.out.println(voinaIMir.getBook());

        idiot.setYear(2014);
        System.out.println(idiot.getBook());
    }
}