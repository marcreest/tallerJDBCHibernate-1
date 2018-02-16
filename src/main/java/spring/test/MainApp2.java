package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext( "/applicationContext.xml" );

		UserController userController = ctx.getBean( UserController.class );
		String message = userController.getDetailUser(0);
		System.out.println("Message: " + message);
	}

}
