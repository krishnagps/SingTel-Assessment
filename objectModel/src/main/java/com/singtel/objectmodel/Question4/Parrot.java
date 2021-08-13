/**
 * 
 */
package com.singtel.objectmodel.Question4;

import com.singtel.objectmodel.Question2.Duck;
import com.singtel.objectmodel.Question3.Rooster;

/**
 * @author krishnamurthy
 *
 */
public class Parrot {
	
	private Dog dog;
	private Cat cat;
	
	private Object animal;
	
	private Duck duck;
	
//	public <T> Parrot(T ob){
//		System.out.println("T Value : "+ob);
//		this.setAnimal(ob);
//	}
	public Parrot(Object object) {
		System.out.println("Inside  generic constructor"+object.getClass().getName());
		
	}
	private Rooster rooster;
	
	public Parrot(Dog dog){
		this.dog=dog;
	}
	
	public Parrot(Duck duck){
		this.setDuck(duck);
	}
	
	public Parrot(Cat cat){
		this.setCat(cat);
	}
	
	public Parrot(Rooster rooster){
		this.setRooster(rooster);
	}
	

	/**
	 * @return the dog
	 */
	public Dog getDog() {
		return dog;
	}

	/**
	 * @return the cat
	 */
	public Cat getCat() {
		return cat;
	}

	/**
	 * @param cat the cat to set
	 */
	public void setCat(Cat cat) {
		this.cat = cat;
	}

	/**
	 * @return the rooster
	 */
	public Rooster getRooster() {
		return rooster;
	}

	/**
	 * @param rooster the rooster to set
	 */
	public void setRooster(Rooster rooster) {
		this.rooster = rooster;
	}

	/**
	 * @return the animal
	 */
	public Object getAnimal() {
		return animal;
	}

	/**
	 * @param animal the animal to set
	 */
	public void setAnimal(Object animal) {
		this.animal = animal;
	}

	/**
	 * @return the duck
	 */
	public Duck getDuck() {
		return duck;
	}

	/**
	 * @param duck the duck to set
	 */
	public void setDuck(Duck duck) {
		this.duck = duck;
	}

	

}
