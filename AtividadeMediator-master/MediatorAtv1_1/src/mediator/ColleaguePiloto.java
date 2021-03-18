package mediator;


public abstract class ColleaguePiloto {
	
	protected MediatorTorre torre;
		
		public ColleaguePiloto(MediatorTorre torre) {
		this.torre = torre;
		}
		
		public abstract void send(String message);
		public abstract void messageReceived(String message);
		
	}