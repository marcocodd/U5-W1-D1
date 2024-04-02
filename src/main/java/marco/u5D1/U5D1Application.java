package marco.u5D1;

import marco.u5D1.entities.MenuConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5D1Application {

    public static void main(String[] args) {
        SpringApplication.run(U5D1Application.class, args);
    }

    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenuConfig.class);
    System.out.println()

}
