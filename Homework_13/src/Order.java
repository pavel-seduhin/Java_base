import java.util.Arrays;
import java.util.Objects;

public class Order {
    public String customer;
    public Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Заказчик: " + customer + "\nЗаказ: " + Arrays.toString(basket);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Order order = (Order) obj;
        if (basket.length != order.basket.length) {
            return false;
        }
        return Objects.equals(this.customer, order.customer) && Arrays.equals(this.basket, order.basket);
    }
}
