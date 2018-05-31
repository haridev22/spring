package spring.diDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring.diDemo.controller.ConstructorBasedInjecton;
import spring.diDemo.controller.MyController;
import spring.diDemo.controller.PropertyInjectedController;
import spring.diDemo.controller.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController)ctx.getBean("myController");
		System.out.println(controller.hello());

		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorBasedInjecton.class).sayHello());

	}
}
