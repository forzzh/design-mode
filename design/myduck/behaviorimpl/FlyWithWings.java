package design.myduck.behaviorimpl;

import design.myduck.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {

		System.out.println("fly with wings");
	}

}
