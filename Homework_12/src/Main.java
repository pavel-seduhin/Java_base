//Домашняя работа 12

public class Main {
    public static void main(String[] args) {

        Author dostoevsky = new Author("Фёдор", "Достоевский");
        Book idiot = new Book("Идиот", dostoevsky.getFirstName(), dostoevsky.getLastName(), 1984);
        System.out.println(idiot.getName() + " " + dostoevsky.getFirstName() + " " +dostoevsky.getLastName() + " " + idiot.getYear());

        Author tolstoy = new Author("Лев", "Толстой");
        Book voinaIMir = new Book("Война и мир", tolstoy.getFirstName(), tolstoy.getLastName(), 1975);
        System.out.println(voinaIMir.getName() + " " + voinaIMir.getAuthor() + " " + voinaIMir.getYear());

        voinaIMir.setYear(2014);
        System.out.println("voinaIMir.getYear() = " + voinaIMir.getYear());
    }
}