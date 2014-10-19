package design.myduck.behaviorimpl;

import design.myduck.behavior.QuackBehavior;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("guagua");
	}

}
