package beta;

import org.apache.logging.log4j.*;

public class LoggingDemo1 {

	private static Logger log = LogManager.getLogger(LoggingDemo1.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.info("I am debugging");

		log.debug("Object is present");
		
		
		log.error("Object is not present");

		
	}

}
