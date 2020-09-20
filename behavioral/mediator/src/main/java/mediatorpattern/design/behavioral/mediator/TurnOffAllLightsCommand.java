package mediatorpattern.design.behavioral.mediator;

public class TurnOffAllLightsCommand implements Command {
	
	private Mediator med;
	
	public TurnOffAllLightsCommand(Mediator med) {
		super();
		this.med = med;
	}

	@Override
	public void execute() {

		med.turnOffAllLights();
	}

}
