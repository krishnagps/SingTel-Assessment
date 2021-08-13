/**
 * 
 */
package com.singtel.objectmodel.Question2;

import com.singtel.objectmodel.Question1.Bird;
import com.singtel.objectmodel.Question1.Soundable;
import com.singtel.objectmodel.Question5.Swimmable;

/**
 * @author krishnamurthy
 *
 */
public class Duck  extends Bird implements Soundable , Swimmable{
	
	public void swim() {
		System.out.println("I am swimming");
	}
	
	public void makeSound() {
		System.out.println("Quack,quack");
		
	}
	
	public void doSwim() {
		// TODO Auto-generated method stub
		System.out.println("I am swimming");
	}

}
