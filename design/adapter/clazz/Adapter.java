package design.adapter.clazz;

/**
 * 类适配器
 * 适配器与适配者之间是继承（或实现）关系
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void method2() {
		// do something
	}

}
