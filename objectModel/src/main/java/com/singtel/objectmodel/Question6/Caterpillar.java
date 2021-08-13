package com.singtel.objectmodel.Question6;



public class Caterpillar  implements FlyBehaviourIF{

	private FlyBehaviourIF flyBehaviour;
	private SoundBehaviourIF soundBehaviour;

	public void setFlyBehaviour(FlyBehaviourIF flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setSoundBehaviour(SoundBehaviourIF soundBehaviour) {
		this.soundBehaviour = soundBehaviour;
	}

	public void performAction(){
	  flyBehaviour.fly();
	  soundBehaviour.sound();
	}

	@Override
	public String fly() {
		System.out.println("Caterpillar can not fly");
		return "Caterpillar can not fly";
	}
	
	 
	
}
