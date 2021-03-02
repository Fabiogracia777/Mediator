
public class ConcreteMediator implements Mediator
{
	private ConcreteColleague1 m_colleage1;
	private ConcreteColleague2 m_colleage2;

	public void setColleage1(ConcreteColleague1 colleage1) {
		m_colleage1 = colleage1;
	}

	public void setColleage2(ConcreteColleague2 colleage2) {
		m_colleage2 = colleage2;
	}

	@Override
	public void send(String message, Colleague colleage) 
	{
		if(colleage == m_colleage1)
		{
			m_colleage2.messageReceived(message);
		}
		else if(colleage == m_colleage2)
		{
			m_colleage1.messageReceived(message);
		}
		else
			System.out.println("Colleage is not in chat");
	}
}
