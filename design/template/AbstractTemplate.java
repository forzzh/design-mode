package design.template;

/*
 * 模板方法模式定义一个操作中算法的框架，
 * 而将一些步骤延迟到子类中。模板方法模式使得子类可以
 * 不改变一个算法的结构即可重定义该算法的某些特定步骤
 */
public abstract class AbstractTemplate {

	/**
	 * 模板方法
	 */
	public void templateMethod(){
		//调用基本方法
		previousMethod();
		
		abstractMethod();
		
		concreteMethod();
	}

	private void concreteMethod() {
		System.out.println("执行方法!");
	}

	/**
	 * 抽象方法由子类实现
	 */
	public abstract void abstractMethod();

	public void previousMethod() {
		
	}
	
	
}
