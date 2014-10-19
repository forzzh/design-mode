package design.myduck;

import design.myduck.behaviorimpl.FlyNoWay;
import design.myduck.behaviorimpl.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}
	
	@Override
	public void display() {

		System.out.println("I am a modle duck");
	}

}
