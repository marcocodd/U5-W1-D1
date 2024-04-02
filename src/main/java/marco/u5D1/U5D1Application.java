package marco.u5D1;

import marco.u5D1.entities.Drink;
import marco.u5D1.entities.Pizza;
import marco.u5D1.entities.Toppings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5D1Application {

    public static void main(String[] args) {
        SpringApplication.run(U5D1Application.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5D1Application.class);

        Pizza margherita = ctx.getBean("margherita", Pizza.class);
//        Pizza salsicciaSecca = ctx.getBean("salsicciasecca", Pizza.class);
        Toppings prosciuttoCotto = ctx.getBean("prosciuttoCotto", Toppings.class);
        Drink water = ctx.getBean("water", Drink.class);
        Drink cola = ctx.getBean("cola", Drink.class);


        System.out.println(margherita);
//        System.out.println(salsicciaSecca);
        System.out.println(prosciuttoCotto);
        System.out.println(water);
        System.out.println(cola);
    }
}


