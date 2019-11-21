package lab4_assignment;

public class Main {

	public static void main(String[] args) {
		//suppose to generate a random number 
		//int x=0;
		//int y=0;
		//Animal []wolf = new Animal[2];
		Animal animal[]=new Animal[2];
		animal[0]=new Animal();
		animal[1]=new Animal();
		
		
		animal[0].setCreatureName("rabbit");
		animal[1].setCreatureName("trees");

		
		
		animal[0].setLocation(1,0);
		animal[1].setLocation(1,1);
		
		animal[0].foodChain(animal[0].getCreatureName()
				,animal[1].getCreatureName());
		animal[0].checkLocation(animal[1].location);
		
		
		System.out.print(animal[1].getCreatureName() + " is " +animal[0].deadOrAlive);
		
		

	}

}
