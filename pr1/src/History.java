import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class History {
    private List<Order> orders;

    public History() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public String toString() {
        return "Історія{" +
                "Всі замовлення=" + orders +
                '}';
    }
}
