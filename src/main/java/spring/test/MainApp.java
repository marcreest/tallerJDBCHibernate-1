package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main( String[] args ) {
		ApplicationContext context = new ClassPathXmlApplicationContext( "/spring/test/Beans.xml" );
		HelloWorld obj = ( HelloWorld ) context.getBean( "helloWorld" );
		String message = obj.getMessage();
		System.out.println( "Message: " + message );
	}
	
}
