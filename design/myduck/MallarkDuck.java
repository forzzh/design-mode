package design.myduck;

import design.myduck.behaviorimpl.FlyWithWings;
import design.myduck.behaviorimpl.Quack;

public class MallarkDuck extends Duck {
	
	public MallarkDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	

	@Override
	public void display() {
		System.out.println("I am a mallark duck");
		
	}
}
