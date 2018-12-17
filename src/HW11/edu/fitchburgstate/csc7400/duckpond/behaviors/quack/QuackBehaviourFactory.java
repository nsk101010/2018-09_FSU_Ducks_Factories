/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Author: Saran,Vamsi,Raghu
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack;

	/*
	 * Quack behaviour for the factory
	 * 
	 */
	public class QuackBehaviourFactory {
			
	/*
	 * @parm is  a string which has sound
	 * @return is a instance QB
	 */

	public static QuackBehavior createQuackBehavior(Quacktype type) {

	QuackBehavior quackbehavior;
		
		
		if(type!=null && type.equals(Quacktype.SQUEAK))
		{
			quackbehavior=new Squeak();
		}
		else if(type!=null && type.equals(Quacktype.QUACK))
		{
			quackbehavior=new DuckQuack();
		}
		else
		{
			quackbehavior=new CannotQuack();
		}
		return quackbehavior;
	}

}
