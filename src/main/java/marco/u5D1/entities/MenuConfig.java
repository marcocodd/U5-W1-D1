package marco.u5D1.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MenuConfig {

    @Bean
    public Pizza margherita() {
        Pizza margherita = new Pizza("Margherita", 5.50, 550);
        return margherita();
    }


    @Bean
    public Toppings salsicciaSecca() {
        return new Toppings("salsicia secca", 1.50, 150);
    }

    @Bean
    public Toppings prosciuttoCotto() {
        return new Toppings("prosciutto cotto", 1.50, 150);
    }

    @Bean
    public Drink water() {
        return new Drink("Acqua", 1, 0);
    }

    public Drink cola() {
        return new Drink("Coca cola", 2.50, 250);
    }

}
