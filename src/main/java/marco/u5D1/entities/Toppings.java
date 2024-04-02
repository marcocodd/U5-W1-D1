package marco.u5D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Toppings extends MenuElement {

    public Toppings(String name, double price, int calories) {
        super(name, price, calories);
    }
}
