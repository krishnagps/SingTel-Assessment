package com.singtel.objectmodel;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import com.singtel.objectmodel.Question1.Bird;
import com.singtel.objectmodel.Question2.Chicken;
import com.singtel.objectmodel.Question2.Duck;
import com.singtel.objectmodel.Question3.Rooster;
import com.singtel.objectmodel.Question4.Cat;
import com.singtel.objectmodel.Question4.Dog;
import com.singtel.objectmodel.Question4.Parrot;
import com.singtel.objectmodel.Question5.Clownfish;
import com.singtel.objectmodel.Question5.Shark;
import com.singtel.objectmodel.Question6.Butterfly;
import com.singtel.objectmodel.Question6.Caterpillar;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test.
 */
public class AppTest 
    extends TestCase
{
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		
	// assigning the values
	   protected void setUp(){
		   System.setOut(new PrintStream(outContent));
		   
	   }
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	questionOne();
    	questionTwo();
    	questionThree();
    	questionFour();
    }
    
  
    public void questionOne()
    {
  //Question1 testing
	assertTrue( true );
    Bird bird = new Bird();
	bird.walk();
	
	assertEquals("Iamwalking",outContent.toString().trim().replace(" ", ""));
	outContent.reset();
	
	bird.fly();
	assertEquals("Iamflying",outContent.toString().trim().replace(" ", ""));
	outContent.reset();
	
	bird.sing();
	assertEquals("IamSinging",outContent.toString().trim().replace(" ", ""));
	outContent.reset();
    }
    
    public void questionTwo()
    {
  //Question1 testing
	assertTrue( true );
	Duck duck = new Duck();
	duck.makeSound();
 
   
	assertEquals("Quack,quack",outContent.toString().trim().replace(" ", ""));
	outContent.reset();
	
	   duck.swim();
	
	assertEquals("Iamswimming",outContent.toString().trim().replace(" ", ""));
outContent.reset();


Chicken chicken =new Chicken();
chicken.makeSound();


assertEquals("Cluck,cluck",outContent.toString().trim().replace(" ", ""));
outContent.reset();
	
    }
    
    public void questionThree()
    {
  //Question1 testing
	assertTrue( true );
    Rooster rooster = new Rooster();
    rooster.makeSound();
	assertEquals("Cock-a-doodle-doo"
            	
            	,outContent.toString().trim().replace(" ", ""));
	outContent.reset();
    }
    
    
    public void questionFour()
    {
  //Question1 testing
	assertTrue( true );
	 Parrot parrot1 = new Parrot(new Dog());
     parrot1.getDog().makeSound();
    
     assertEquals("Woof,woof"         	
         	,outContent.toString().trim().replace(" ", ""));
	outContent.reset();
     
     Parrot parrot2 = new Parrot(new Cat());
     parrot2.getCat().makeSound();
     
     assertEquals("Meow"         	
          	,outContent.toString().trim().replace(" ", ""));
 	outContent.reset();
     
     Parrot parrot3 = new Parrot(new Rooster());
     parrot3.getRooster().makeSound();
     
     assertEquals("Cock-a-doodle-doo"         	
           	,outContent.toString().trim().replace(" ", ""));
  	outContent.reset();
     
     Parrot parrot4 = new Parrot(new Duck());
     parrot4.getDuck().makeSound();
	assertEquals("Quack,quack"
            	
            	,outContent.toString().trim().replace(" ", ""));
	outContent.reset();
    }
    
    
    public void questionFive()
    {
  //Question1 testing
	assertTrue( true );
	  Shark shark = new Shark();
      shark.getColor();
     
     
    
     assertEquals("grey"         	
         	,outContent.toString().trim().replace(" ", ""));
	outContent.reset();
     
	 shark.getSize();
     
     assertEquals("Large"         	
          	,outContent.toString().trim().replace(" ", ""));
 	outContent.reset();
     
 	 shark.isEatFish();
     
     assertEquals("true"         	
           	,outContent.toString().trim().replace(" ", ""));
  	outContent.reset();
     
  	assertTrue( true );
  	 Clownfish clownFish = new Clownfish();
     clownFish.setColor();
     
   assertEquals("orange"         	
       	,outContent.toString().trim().replace(" ", ""));
	outContent.reset();
   
	clownFish.setSize();
   
   assertEquals("small"         	
        	,outContent.toString().trim().replace(" ", ""));
	outContent.reset();
   
	 clownFish.isMakeJokes();
   
   assertEquals("true"         	
         	,outContent.toString().trim().replace(" ", ""));
	outContent.reset();
    }
    
    
    public void questionSix()
    {
  //Question1 testing
	assertTrue( true );
	Caterpillar caterpillar = new Caterpillar();
	caterpillar.fly();
	
	
    
     assertEquals("Caterpillar can not fly"         	
         	,outContent.toString().trim());
	outContent.reset();
	caterpillar.setFlyBehaviour(new Butterfly());
	
	caterpillar.performAction();
	
	 assertEquals("Butterfly can fly"         	
	         	,outContent.toString().trim());
		outContent.reset();
    
caterpillar.setSoundBehaviour(new Butterfly()); //
caterpillar.performAction();
assertEquals("Butterfly does not make a sound"         	
     	,outContent.toString().trim());
outContent.reset();
caterpillar.setFlyBehaviour(new Butterfly());
		
    }
    
}