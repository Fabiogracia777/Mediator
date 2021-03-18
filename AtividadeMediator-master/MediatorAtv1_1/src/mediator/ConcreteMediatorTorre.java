package mediator;


public class ConcreteMediatorTorre implements MediatorTorre
{
	private ConcretePiloto1 a_piloto1;
	private ConcretePiloto2 a_piloto2;

	public void setPiloto1(ConcretePiloto1 piloto1) {
		a_piloto1 = piloto1;
	}

	public void setPiloto2(ConcretePiloto2 piloto2) {
		a_piloto2 = piloto2;
	}

	@Override
	public void send(String message, ColleaguePiloto colleage) 
	{
		if(colleage == a_piloto1)
		{
			a_piloto2.messageReceived(message);
		}
		else if(colleage == a_piloto2)
		{
			a_piloto1.messageReceived(message);
		}
			
	}
}