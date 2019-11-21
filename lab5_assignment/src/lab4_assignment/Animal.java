package lab4_assignment;



public class Animal {
	public  String creatureName;
//the distance between creature 
//create a 2D location of animals
	public  int  [] location ;
	public int speciesNumber;
	boolean eatable;
	String deadOrAlive;
	public int locationX;
	public int locationY;
//initial variables
	public Animal(){
		this.locationX=0;
		this.locationY=0;//allocate space
		this.eatable=false;
		this.deadOrAlive="Alive";
	}	
	public int getXRandomIntegerBetweenRange()
	{
		this.locationX=(int)(Math.random()*((4-0)+1))+0;
		return this.locationX;
		
	}
	public int getYRandomIntegerBetweenRange()
	{
		this.locationY=(int)(Math.random()*((4-0)+1))+0;
		return this.locationY;
		
	}
	public void setLocation(int x,int y)
	{
		this.locationX=x;
		this.locationY=y;
	}
	/*
	 * check the relationship of tow animals
	 */
	public void checkLocation(Animal x)
	{
		if(this.eatable && this.locationX==x.locationX && this.locationY==x.locationY)
		{	
				x.deadOrAlive="Dead";
		}
		else
			this.deadOrAlive="Alive";
		
	}
	public Boolean foodChain(String name1,String name2)
	{
		if(name1== "wolf"  && name2 == "rabbit" || name2== "wolf"  && name1 == "rabbit")
		{
			this.eatable=true;
		}
		
		if(name1== "wolf"  && name2 == "deer")
		{
			this.eatable=true;
		}
		if(name1== "fox"  && name2 == "rebbit")
		{
			this.eatable=true;
		}
		if(name1== "fox"  && name2 == "squirrel")
		{
			this.eatable=true;
		}
		if(name1== "fox"  && name2 == "bluejay")
		{
			this.eatable=true;
		}
		if(name1== "hawk"  && name2 == "squirrel")
		{
			this.eatable=true;
		}
		if(name1== "hawk"  && name2 == "mouse")
		{
			this.eatable=true;
		}
		if(name1== "rabbit"  && (name2 == "grass" || name2=="trees"))
		{
			this.eatable=true;
		}
		if(name1== "deer"  && (name2 == "grass" || name2=="trees"))
		{
			this.eatable=true;
		}
		if(name1== "mouse"  && (name2 == "grass" || name2=="trees"))
		{
			this.eatable=true;
		}
		if(name1== "squirrel"  && name2 == "trees")
		{
			this.eatable=true;
		}
		if(name1== "caterpillar"  && name2 == "trees")
		{
			this.eatable=true;
		}
		if(name1== "grasshooper"  && name2 == "grass")
		{
			this.eatable=true;
		}
		if(name1== "bluejay"  && (name2 == "caterpillar" || name2=="grasshooper"))
		{
			this.eatable=true;
		}
		return this.eatable;
			
	}
	public String getCreatureName() {
		return creatureName;
	}
	public  void setCreatureName(String creatureName) {
		this.creatureName = creatureName;
	}
	


}
