package marco.u5D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public abstract class MenuElement {
    protected String name;
    protected double price;
    protected int calories;

    public MenuElement(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }
}

