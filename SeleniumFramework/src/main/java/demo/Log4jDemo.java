package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

public class Log4jDemo {
	
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n Hello \n");
		
		logger.trace("This is trace");
		logger.info("This is info");
		logger.error("This is error");
		logger.warn("This is warning");
		logger.fatal("This is fatal");
		
		System.out.println("\n end");

	}

}
