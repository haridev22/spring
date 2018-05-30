package spring.jokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring.jokes.controller.MyController;

@SpringBootApplication
public class JokesApplication {

    public static void main(String[] args) {

        ApplicationContext ctx=SpringApplication.run(JokesApplication.class, args);
        MyController controller = (MyController)ctx.getBean("myController");
        controller.hello();
    }
}
