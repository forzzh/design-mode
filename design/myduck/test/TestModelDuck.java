package design.myduck.test;

import design.myduck.Duck;
import design.myduck.ModelDuck;
import design.myduck.behaviorimpl.FlyWithWings;

public class TestModelDuck {

	public static void main(String[] args) {

		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		//使运行时能改变状态
		model.setFlyBehavior(new FlyWithWings());
		model.performFly();
	}

}
