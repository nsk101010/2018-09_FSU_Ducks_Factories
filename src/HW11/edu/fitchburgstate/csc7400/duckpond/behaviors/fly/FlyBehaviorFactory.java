/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Author: Saran,Vamsi,Raghu
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly;

/*
 * created fly factories  for behaviours
 */

public class FlyBehaviorFactory {

	/*
	 * 
	 * @param is text to display
	 * @return instance of the class
	 */

	public static FlyingBehavior createFlyBehavior(String type)
	{
		FlyingBehavior flyingbehavior;

		if(type!=null)
		{
			flyingbehavior=new SimpleFly(type);
			
		}
		else
		{
			flyingbehavior=new CannotFly();
		}
		return flyingbehavior;
	}

}
