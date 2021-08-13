package com.singtel.objectmodel;

import java.util.List;
import java.util.stream.Stream;

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


/**
 * Solution
 *
 */
enum Color
{
  ORANGE, GREY
}

enum Size
{
  SMALL, LARGE
}
interface Specification<T>
{
  boolean isSatisfied(T item);
}
interface Filter<T>
{
  Stream<T> filter(List<T> items, Specification<T> spec);
}
public class Solution 
{
    public static void main( String[] args )
    {
    	//Question1 
    	System.out.println("===============Question 1 output start:=========================");
   	 	 Bird bird = new Bird();
         bird.walk();
         bird.fly();
         bird.sing();
         
         System.out.println("===============Question 1 output end:=========================");   
         System.out.println();
         
         //Question 2
         System.out.println("===============Question 2 output start:=========================");
         
        Duck duck = new Duck();
        Chicken chicken =new Chicken();
        duck.swim();
        duck.makeSound();
        chicken.makeSound();
        System.out.println("===============Question 2 output end:=========================");
        System.out.println();
        
        
        System.out.println("===============Question 3 output start:=========================");
       
      //Question 3
       //through interface
      
       Rooster rooster = new Rooster();
       rooster.makeSound();
       System.out.println("===============Question 3 output end:=========================");
       System.out.println();
       
       //Question 4
       
       System.out.println("===============Question 4 output start:=========================");
      
       Parrot parrot1 = new Parrot(new Dog());
       parrot1.getDog().makeSound();
       Parrot parrot2 = new Parrot(new Cat());
       parrot2.getCat().makeSound();
       Parrot parrot3 = new Parrot(new Rooster());
       parrot3.getRooster().makeSound();
       
       Parrot parrot4 = new Parrot(new Duck());
       parrot4.getDuck().makeSound();
       
       System.out.println("===============Question 4 output end:=========================");
       System.out.println();
       System.out.println("===============Question 5(B. Model fish as well as other swimming animals) output start:=========================");
       
     //Question 5
       
       class Fish
       {
         public String name;
         public Color color;
         public Size size;

         public Fish(String name, Color color, Size size) {
           this.name = name;
           this.color = color;
           this.size = size;
         }
       }
       
       class ColorSpecification implements Specification<Fish>
       {
         private Color color;

         public ColorSpecification(Color color) {
           this.color = color;
         }

         @Override
         public boolean isSatisfied(Fish p) {
           return p.color == color;
         }
       }

       class SizeSpecification implements Specification<Fish>
       {
         private Size size;

         public SizeSpecification(Size size) {
           this.size = size;
         }

         @Override
         public boolean isSatisfied(Fish p) {
           return p.size == size;
         }
       }
       class AndSpecification<T> implements Specification<T>
       {
         private Specification<T> first, second;

         public AndSpecification(Specification<T> first, Specification<T> second) {
           this.first = first;
           this.second = second;
         }

         @Override
         public boolean isSatisfied(T item) {
           return first.isSatisfied(item) && second.isSatisfied(item);
         }

       }
       
       class BetterFilter implements Filter<Fish>
       {
         @Override
         public Stream<Fish> filter(List<Fish> items, Specification<Fish> spec) {
           return items.stream().filter(p -> spec.isSatisfied(p));
         }
       }
       
       //
      
     
      
      Fish shark1 = new Fish("Sharks", Color.GREY, Size.LARGE);
      Fish clownFish1 = new Fish("ClownFish", Color.ORANGE, Size.SMALL);
     
      List<Fish> typesOfFish = List.of(shark1, clownFish1);
      BetterFilter bf = new BetterFilter();
      System.out.println("Large Grey items:");
      bf.filter(typesOfFish,
        new AndSpecification<>(
          new ColorSpecification(Color.GREY),
          new SizeSpecification(Size.LARGE)
        ))
        .forEach(p -> System.out.println(" - " + p.name + " is large and GREY"));
    
      bf.filter(typesOfFish,
    	        new AndSpecification<>(
    	          new ColorSpecification(Color.ORANGE),
    	          new SizeSpecification(Size.SMALL)
    	        ))
    	        .forEach(p -> System.out.println(" - " + p.name + " is SMALL and COLORFUL ORANGE"));
      
      Shark shark = new Shark();
      shark.setColor();
      shark.setSize();
      shark.setEatFish();
     System.out.println("Size:"+shark.getSize());
     System.out.println("Color:"+shark.getColor());
     System.out.println("EatFish:"+shark.isEatFish());
      
      Clownfish clownFish = new Clownfish();
      clownFish.setColor();
      clownFish.setSize();
      clownFish.setMakeJokes();
     System.out.println("Size:"+clownFish.getSize());
     System.out.println("Color:"+clownFish.getColor());
     System.out.println("MakeJokes:"+clownFish.isMakeJokes());
     System.out.println("===============Question 5 (B. Model fish as well as other swimming animals) output end:=========================");
     
     
     System.out.println("===============Question 6 output end:=========================");
     
     	Caterpillar caterpillar = new Caterpillar();
		caterpillar.fly();
		
		caterpillar.setFlyBehaviour(new Butterfly());
		caterpillar.setSoundBehaviour(new Butterfly());
		
		caterpillar.performAction();
     
     System.out.println("===============Question 6 output end:=========================");
     
    }
}
