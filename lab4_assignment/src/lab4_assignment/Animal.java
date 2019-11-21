package lab4_assignment;



public class Animal {
	private String creatureName;
//the distance between creature 
//create a 2D location of animals
	int  [] location ;
	boolean eatable;
	String deadOrAlive;
//initial variables
	public Animal(){
		location =new int[2];//allocate space
		this.eatable=false;	
		
	}	
	public void setLocation(int x,int y)
	{
		this.location[0]=x;
		this.location[1]=y;
	}
	/*
	 * check the relationship of tow animals
	 */
	public void checkLocation(int location2[])
	{
		
		if(this.eatable && this.location[0]==location2[0] && this.location[1]==location2[1])
		{	
				this.deadOrAlive="Dead";		
		}
		else
			this.deadOrAlive="Alive";
		
	}
	public Boolean foodChain(String name1,String name2)
	{
		if(name1== "wolf"  && name2 == "rabbit")
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
	public void setCreatureName(String creatureName) {
		this.creatureName = creatureName;
	}
	


}
