
public class Main {

	public static void main(String[] args) 
	{	
		ConcreteMediator mediator = new ConcreteMediator();
		
		ConcreteColleague1 coleague1 = new ConcreteColleague1(mediator);
		ConcreteColleague2 coleague2 = new ConcreteColleague2(mediator);
		
		mediator.setColleage1(coleague1);
		mediator.setColleage2(coleague2);
		
		coleague1.send("Hi, how are you?");
		coleague2.send("great thanks!");
	}

}
