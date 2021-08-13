/**
 * 
 */
package com.singtel.objectmodel.Question3;

import com.singtel.objectmodel.Question1.Soundable;
import com.singtel.objectmodel.Question2.Chicken;

/**
 * @author krishnamurthy
 *
 */

//public class Rooster extends chicken implements  Soundable{
public class Rooster extends Chicken implements  Soundable{
	
	public void makeSound() {
		
		System.out.println("Cock-a-doodle-doo");
	}

}
