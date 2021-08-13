/**
 * 
 */
package com.singtel.objectmodel.Question7;

import java.lang.reflect.Method;
import java.util.Arrays;

import com.singtel.objectmodel.Question1.Animal;
import com.singtel.objectmodel.Question1.Bird;
import com.singtel.objectmodel.Question2.Duck;
import com.singtel.objectmodel.Question4.Dog;
import com.singtel.objectmodel.Question5.Clownfish;
import com.singtel.objectmodel.Question5.Dolphin;
import com.singtel.objectmodel.Question5.Fish;
import com.singtel.objectmodel.Question5.Shark;
import com.singtel.objectmodel.Question5.Swimmable;

/**
 * @author krishnamurthy
 *
 */
public class CountTest {
	
	
	
	
	
	public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        Swimmable[] swim = new Swimmable[5];
        
        animals[0] = new Dog();
        animals[1] = new Bird();
        animals[2] = new Duck();
       
        
        swim[0] =  new Shark();
        swim[1] =  new Clownfish();
        swim[2] = new Dolphin();
        swim[3] = new Dog();
        swim[4] = new Duck();
       int count =0;
        for (int i = 0; i < animals.length; i++) {
           Method[] methods= animals[i].getClass().getDeclaredMethods();
         if(Arrays.asList(methods).toString().contains("walk")){
        	 ++count;
        	
          } 
         
        }
        
        System.out.println("count of walk implementation>>"+count);
        
        
       count =0;
        for (int i = 0; i < swim.length; i++) {
           Method[] methods= swim[i].getClass().getDeclaredMethods();
           if(Arrays.asList(methods).toString().contains("doSwim") || Arrays.asList(methods).toString().contains("doSwim")){
        	 ++count;
        	
          } 
        }
        
        System.out.println("count of swim implementation>>"+count);
        
        
        
        count =0;
        for (int i = 0; i < animals.length; i++) {
           Method[] methods= animals[i].getClass().getDeclaredMethods();
         if(Arrays.asList(methods).toString().contains("fly")){
        	 ++count;
        	  } 
        }
        
        System.out.println("count of fly implementation>>"+count);
        
        
        count =0;
        for (int i = 0; i < animals.length; i++) {
           Method[] methods= animals[i].getClass().getDeclaredMethods();
         if(Arrays.asList(methods).toString().contains("sing")){
        	 ++count;
        	  } 
        }
        
        System.out.println("count of sing implementation>>"+count);
        
    }
 
}
