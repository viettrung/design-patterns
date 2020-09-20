package mediatorpattern.design.behavioral.mediator;

// receiver
public class Light {

	private boolean isOn = false;
	
	private String location = "";
	
	public Light() {
		super();
	}

	public Light(String location) {
		super();
		this.location = location;
	}
	
	public boolean isOn() {
		return isOn;
	}

	public void toggle() {
		if (isOn) {
			off();
		} else {
			on();
		}
	}
	
	public void on() {
		System.out.println(location + " switched on!");
		isOn = true;
	}
	
	public void off() {
		System.out.println(location + " switched off!");
		isOn = false;
	}
}
