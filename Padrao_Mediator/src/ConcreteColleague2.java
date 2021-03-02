
public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator midiator) {
		super(midiator);
	}

	@Override
	public void send(String message) {
		midiator.send(message, this);

	}

	@Override
	public void messageReceived(String message) {
		System.out.println("colleage2 got message " + message);

	}

}
