package demos.patterns.singleton.test4;
/*
 * 如果在构造函数中抛出异常，实例将永远得不到创建，也会出错。所以说，十分完美的东西是没有的，我们只能根据实际情况，选择最适合自己应用场景的实现方法。
 */
public class Singleton {
	 
	/* 私有构造方法，防止被实例化 */
	private Singleton() {
	}
 
	/* 此处使用一个内部类来维护单例 */
	private static class SingletonFactory {
		private static Singleton instance = new Singleton();
	}
 
	/* 获取实例 */
	public static Singleton getInstance() {
		return SingletonFactory.instance;
	}
 
	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
	public Object readResolve() {
		return getInstance();
	}

}