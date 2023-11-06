package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4Demo {
	
	private static Logger logger = LogManager.getLogger(Log4Demo.class); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n Hello World... \n");
		
		logger.info("this is info message");
		logger.error("This is error message");
		logger.warn("This is a warn messag ");
		logger.fatal("This is a fatal message");
		
		
		System.out.println("\nCompleted");
		
	}

}
