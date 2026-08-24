//Домашняя работа 13

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(111, "Чайник", 1500, "kitchen");
        Product product2 = new Product(222, "Ревизор", 450, "books");
        Product product3 = new Product(333, "Телевизор", 19000, "electronics");
        Product product4 = new Product(111, "Миксер", 1200, "kitchen");
        Product product5 = new Product(444, "PlayStation", 100000, "games");

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
        System.out.println(product5);

        System.out.println(product1.equals(product2));
        System.out.println(product1.equals(product3));
        System.out.println(product1.equals(product4));
        System.out.println(product1.equals(product5));


        Product[] basket1 = {product1, product2, product3};
        Product[] basket2 = {product3, product4, product5};
        Product[] basket3 = {product1, product2, product3};
        Product[] basket4 = {product1, product2, product3};

        Order order1 = new Order("customer1", basket1);
        Order order2 = new Order("customer2", basket2);
        Order order3 = new Order("customer3", basket3);
        Order order4 = new Order("customer1", basket4);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
        System.out.println(order4);

        System.out.println(order1.equals(order2));
        System.out.println(order1.equals(order3));
        System.out.println(order1.equals(order4));
    }
}