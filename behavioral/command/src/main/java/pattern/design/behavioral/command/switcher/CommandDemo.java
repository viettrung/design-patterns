package pattern.design.behavioral.command.switcher;

// client
public class CommandDemo {

	public static void main(String[] args) {

		Light light = new Light();
		
		Switch lightSwitch = new Switch();
		
		Command onCommand = new OnCommand(light);
		lightSwitch.storeAndExecute(onCommand);
		
		Command toggleCommand = new ToggleCommand(light);
		lightSwitch.storeAndExecute(toggleCommand);
		
	}

}
