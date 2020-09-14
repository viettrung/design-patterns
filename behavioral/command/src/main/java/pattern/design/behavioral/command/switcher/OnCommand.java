package pattern.design.behavioral.command.switcher;

// concrete Command
public class OnCommand implements Command {

	private Light light;
	
	public OnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {

		light.on();
	}

}
