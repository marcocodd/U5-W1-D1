package marco.u5D1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink extends MenuElement {
    public Drink(String name, double price, int calories) {
        super(name, price, calories);
    }
}
