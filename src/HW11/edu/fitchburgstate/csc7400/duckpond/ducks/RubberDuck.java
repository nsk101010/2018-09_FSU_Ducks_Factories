/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Students: Saran,Vamsi,Raghu
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.ducks;

import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.CannotFly;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.Squeak;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SimpleSwim;

/**
 * Rubber duck for pond
 */
public class RubberDuck extends Duck {

	/**
	 * Creates a new rubber duck
	 */
	public RubberDuck() {
		super("Rubber Duck",
				"ducky.bmp",
				new CannotFly(),
				new SimpleSwim("rubber duck floating"),
				new Squeak());
	}

        /** 
         *  Rubber duck don't fly
         */
        public void fly() {
        System.out.println("Rubber duck continues to swim");
        }

        /** 
         *  Squeaks like a rubber duck.
         */
         public void quack() {
         System.out.println("Squeak");
         }
}
