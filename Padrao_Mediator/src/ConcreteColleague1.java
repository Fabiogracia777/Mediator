
public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator midiator) {
		super(midiator);
	}

	@Override
	public void send(String message) {
		midiator.send(message, this);

	}

	@Override
	public void messageReceived(String message) {
		System.out.println("colleage1 got message " + message);
	}

}