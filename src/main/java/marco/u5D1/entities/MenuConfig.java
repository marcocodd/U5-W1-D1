package marco.u5D1.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MenuConfig {


    @Bean
    public Toppings prosciuttoCotto() {
        return new Toppings("prosciutto cotto", 1.50, 150);
    }

    @Bean
    public Drink water() {
        return new Drink("Acqua", 1, 0);
    }

    @Bean
    public Drink cola() {
        return new Drink("Coca cola", 2.50, 250);
    }

}
