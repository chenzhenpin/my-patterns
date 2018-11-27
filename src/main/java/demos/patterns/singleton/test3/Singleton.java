package demos.patterns.singleton.test3;


public class Singleton {
	 
	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
	private static Singleton instance = null;
 
	/* 私有构造方法，防止被实例化 */
	private Singleton() {
	}
 
	/* 静态工程方法，创建实例  ,线程安全，提升性能，可能有问题*/
	/*
	a>A、B线程同时进入了第一个if判断

	b>A首先进入synchronized块，由于instance为null，所以它执行instance = new Singleton();
	
	c>由于JVM内部的优化机制，JVM先画出了一些分配给Singleton实例的空白内存，并赋值给instance成员（注意此时JVM没有开始初始化这个实例），然后A离开了synchronized块。
	
	d>B进入synchronized块，由于instance此时不是null，因此它马上离开了synchronized块并将结果返回给调用该方法的程序。
	
	e>此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。
	
	所以程序还是有可能发生错误，其实程序在运行过程是很复杂的，从这点我们就可以看出，尤其是在写多线程环境下的程序更有难度，有挑战性。我们对该程序做进一步优化：
	*/
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

 
	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
	public Object readResolve() {
		return instance;
	}
}