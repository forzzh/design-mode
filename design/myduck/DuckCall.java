package design.myduck;

import design.myduck.behavior.QuackBehavior;


public class DuckCall implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("guagua");
	}
	
	
}
