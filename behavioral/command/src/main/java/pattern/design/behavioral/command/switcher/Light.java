package pattern.design.behavioral.command.switcher;

// receiver
public class Light {

	private boolean isOn = false;
	
	public void toggle() {
		if (isOn) {
			off();
		} else {
			on();
		}
	}
	
	public void on() {
		System.out.println("Light switched on!");
		isOn = true;
	}
	
	public void off() {
		System.out.println("Light switched off!");
		isOn = false;
	}
}
