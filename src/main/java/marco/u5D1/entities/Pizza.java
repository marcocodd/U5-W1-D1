package marco.u5D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Pizza extends MenuElement {
    List<Toppings> topping;

    public Pizza(String name, double price, int calories) {
        super(name, price, calories);
    }

    public Pizza(String name, double price, int calories, List<Toppings> topping) {
        super(name, price, calories);
        this.topping.add(new Toppings("Mozzarella", 2, 100));
        this.topping.add(new Toppings("Pomodoro", 1, 50));
    }

    public void addTopping(Toppings topping) {
        this.topping.add(topping);
    }
}
