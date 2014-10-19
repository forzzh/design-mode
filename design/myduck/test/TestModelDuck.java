package design.myduck.test;

import design.myduck.Duck;
import design.myduck.ModelDuck;
import design.myduck.behaviorimpl.FlyWithWings;

public class TestModelDuck {

	public static void main(String[] args) {

		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		//ʹ����ʱ�ܸı�״̬
		model.setFlyBehavior(new FlyWithWings());
		model.performFly();
	}

}
