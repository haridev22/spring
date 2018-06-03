package spring.diDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring.diDemo.controller.ConstructorBasedInjecton;
import spring.diDemo.controller.MyController;
import spring.diDemo.controller.PropertyInjectedController;
import spring.diDemo.controller.SetterInjectedController;
import spring.diDemo.exampleBeans.FakeDataSource;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController)ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource)ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.toString());

	}
}
