package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnnotationsApp {
	public static void main( String[] args ) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext( HelloWorldConfig.class );
		
		HelloWorld helloWorld = ctx.getBean( HelloWorld.class );
		helloWorld.setMessage( "Hello World!" );
		String message = helloWorld.getMessage();
		System.out.println( "Message: " + message );
	}
}
