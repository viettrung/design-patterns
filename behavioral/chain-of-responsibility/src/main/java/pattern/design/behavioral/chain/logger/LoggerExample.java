package pattern.design.behavioral.chain.logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExample {

	private static final Logger LOGGER = Logger.getLogger(LoggerExample.class.getName());
	
	public static void main(String[] args) {

		LOGGER.setLevel(Level.FINER);
		
		ConsoleHandler handler = new ConsoleHandler();
		handler.setLevel(Level.FINER);
		
		LOGGER.addHandler(handler);
		
		LOGGER.finest("finest level of logging"); // won't be printed
		LOGGER.finer("Finer level");
		LOGGER.fine("Fine");
	}

}
