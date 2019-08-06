package socgen.interviews;

import java.util.ArrayList;

public class Orders extends ArrayList {

    public void AddOrder(Order order) {
        super.add(order);
    }

    public int getOrdersCount() {
        return super.size();
    }

    public Order getOrder(int i) {
        return (Order) super.get(i);
    }
}
