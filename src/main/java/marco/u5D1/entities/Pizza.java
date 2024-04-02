package marco.u5D1.entities;

import java.util.List;

public class Pizza extends MenuElement {
    List<Toppings> topping;
    
    public Pizza(String name, double price, int calories) {
        super(name, price, calories);
    }

    public Pizza(String name, double price, int calories, List<Toppings> topping) {
        super(name, price, calories);
        this.topping = topping;
    }
}
