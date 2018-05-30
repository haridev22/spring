package spring.diDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring.diDemo.controller.MyController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController)ctx.getBean("myController");
		controller.hello();

	}
}
