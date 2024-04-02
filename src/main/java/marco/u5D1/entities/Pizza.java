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

    public Pizza(String name, double price, int calories, List<Toppings> topping) {
        super(name, price, calories);
        this.topping = topping;
    }

    public void addTopping(Toppings topping) {
        this.topping.add(topping);
    }


    public List<Toppings> getToppings() {
        return topping;
    }
}
