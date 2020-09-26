package pattern.design.behavioral.mediator;

public class MediatorDemo {

	public static void main(String[] args) {

		Mediator mediator = new Mediator();
		
		Light bedroomLight = new Light("Bedroom");
		Light kitchenLight = new Light("Kitchen");
		
		mediator.register(bedroomLight);
		mediator.register(kitchenLight);
		
		Command turnOnAllLights = new TurnOnAllLightsCommand(mediator);
		
		turnOnAllLights.execute();
		
		Command turnOffAllLights = new TurnOffAllLightsCommand(mediator);
		
		turnOffAllLights.execute();
	}

}
