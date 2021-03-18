package mediator;


public class Main {

	public static void main(String[] args) 
	{	
		ConcreteMediatorTorre mediator = new ConcreteMediatorTorre();
		
		ConcretePiloto1 piloto1 = new ConcretePiloto1(mediator);
		ConcretePiloto2 piloto2 = new ConcretePiloto2(mediator);
		
		mediator.setPiloto1(piloto1);
		mediator.setPiloto2(piloto2);
		
		
                System.out.println("");
                
                piloto1.send("Requerindo Permição para pouso.");
                System.out.println("permição concedida");
                System.out.println("Pista livre para pouso");
                System.out.println("");
                System.out.println("Pouso com sucesso");
                System.out.println("----------------------------------");
                System.out.println("");
		
                piloto2.send("Requerindo Permição para decolagem.");
                System.out.println("permição concedida");
                System.out.println("Pista livre para decolagem");
                System.out.println("");
                System.out.println("Decolagem com sucesso");
                System.out.println("");
	}

}