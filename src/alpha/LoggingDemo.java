package alpha;

import org.apache.logging.log4j.*;

public class LoggingDemo {

	private static Logger log = LogManager.getLogger(LoggingDemo.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.info("I am debugging");

		log.debug("Object is present");
		
		log.fatal("Object is not missing");
		log.error("Object is not present");

		
	}

}
