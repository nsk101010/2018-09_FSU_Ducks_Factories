/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Students: Saran,Vamsi,Raghu
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack;

	/*
	 * Quack behaviour for the factory
	 * 
	 */
	public class QuackBehaviourFactory {
			
	public Quacktype type;

	/*
	 * @parm is  a string which has sound
	 * @return is a instance QB
	 */

	public static QuackBehavior QuackB(Quacktype type) {

	QuackBehavior QB=null;
		
		
		if(type!=null && type.equals(Quacktype.SQUEAK))
		{
			QB=new Squeak();
		}
		else if(type!=null && type.equals(Quacktype.QUACK))
		{
			QB=new DuckQuack();
		}
		else
		{
			QB=new CannotQuack();
		}
		return QB;
	}

}
