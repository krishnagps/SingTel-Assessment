/**
 * 
 */
package com.singtel.objectmodel.Question4;

import com.singtel.objectmodel.Question1.Animal;
import com.singtel.objectmodel.Question1.Soundable;

/**
 * @author krishnamurthy
 *
 */
public class Cat extends Animal implements Soundable{

	public void makeSound() {
		System.out.println("Meow");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

}
