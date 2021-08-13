package com.singtel.objectmodel.Question6;

public class Simulator {
	public static void main(String args[]){

		Caterpillar caterpillar = new Caterpillar();
		caterpillar.fly();
		
		caterpillar.setFlyBehaviour(new Butterfly());
		caterpillar.setSoundBehaviour(new Butterfly());
		
		caterpillar.performAction();
	}

}
