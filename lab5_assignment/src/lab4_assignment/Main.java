package lab4_assignment;

public class Main {

	public static void main(String[] args) {
		//suppose to generate a random number 
		//Animal []wolf = new Animal[2];
		Animal animal[]=new Animal[2];
		animal[0]=new Wolf();
		animal[1]=new Rabbit();
		
		

		
		
//		animal[0].setLocation(animal[0].getXRandomIntegerBetweenRange(),animal[0].getYRandomIntegerBetweenRange());
//		animal[0].setLocation(1,2);
//		animal[1].setLocation(1,1);
//		
//		animal[1].foodChain(animal[0].creatureName,animal[1].creatureName);
//		animal[1].checkLocation(animal[1].locationX,animal[1].locationY);
//		
//		System.out.println(animal[0].locationX + "  " + animal[0].locationY);
//		System.out.println(animal[1].locationX + "  " + animal[1].locationY);
//      System.out.print(animal[1].creatureName + " is " +animal[1].deadOrAlive);
		
		animal[0].setLocation(animal[0].getXRandomIntegerBetweenRange(),animal[0].getYRandomIntegerBetweenRange());
	    animal[1].setLocation(animal[1].getXRandomIntegerBetweenRange(),animal[1].getYRandomIntegerBetweenRange());
	    animal[0].foodChain(animal[0].creatureName,animal[1].creatureName);
	    animal[0].checkLocation(animal[1]);// can animal[0] eat animal[1]?
	    
	    
	    System.out.println(animal[0].locationX + "  " + animal[0].locationY);
	    System.out.println(animal[1].locationX + "  " + animal[1].locationY);
	    System.out.println(animal[0].creatureName + " is " +animal[0].deadOrAlive);
	    System.out.println(animal[1].creatureName + " is " +animal[1].deadOrAlive);
	
		
	}

}
