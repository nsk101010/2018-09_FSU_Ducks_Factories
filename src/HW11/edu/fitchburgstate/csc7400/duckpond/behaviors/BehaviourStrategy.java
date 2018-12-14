/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 12
 * Students: Saran,Vamsi,Raghu
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors;

import external.Bitmap;
import external.BitmapImpl;
import external.GIF;
import external.GifImpl;

public class BehaviourStrategy {

	/**  
	 * Returns the flying behavior
  	 */
 	
	public FlyingBehavior getFlyBehavior()

 	/**
  	 * Returns the quacking behavior
  	 */

 	public QuackBehavior getQuackBehavior()

 	/**
  	 * Returns the swimming behavior
  	 */

	public SwimBehavior getSwimBehavior()


 	/**
  	 * Creates a new Mallard duck with appropriate bitmaps and GIFs
  	 */
 
	public Mallard() {
 	super("Mallard",
 	"mallard.bmp",
 	BehaviorStrategy.getBehaviors("mallard flap","mallard paddle", QuackType.DUCK));
 	}
}
