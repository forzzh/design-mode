package design.adapter.object;

/**
 * 对象适配器模式,
 * 适配器与适配者之间是关联关系
 */
public class Adapter {
	
	private Adaptee adaptee;
	
	

	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	public void method1() {
		adaptee.method1();
	}
	
	public void method2() {
		//自己的方法
	}
}
