/**
 * 
 */
package com.singtel.objectmodel.Question4;

import com.singtel.objectmodel.Question1.Animal;
import com.singtel.objectmodel.Question1.Soundable;
import com.singtel.objectmodel.Question5.Swimmable;

/**
 * @author krishnamurthy
 *
 */

public class Dog extends Animal implements Soundable, Swimmable{
	
	
	public void makeSound() {
		System.out.println("Woof, woof");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	
	public void doSwim() {
		// TODO Auto-generated method stub
		System.out.println("I am swimming");
	}

}
