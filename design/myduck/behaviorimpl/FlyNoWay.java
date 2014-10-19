package design.myduck.behaviorimpl;

import design.myduck.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can not fly");

	}

}
