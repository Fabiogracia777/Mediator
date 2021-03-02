
public abstract class Colleague {
	
	protected Mediator midiator;
		
		public Colleague(Mediator midiator) {
		this.midiator = midiator;
		}
		
		public abstract void send(String message);
		public abstract void messageReceived(String message);
		
	}


