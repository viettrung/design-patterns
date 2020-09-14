package pattern.design.behavioral.command.switcher;

// invoker
public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}
}
