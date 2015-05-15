package com.test;
//懒汉式单例模式
public class TestSingleton {
	String name = null;
		//私有化构造函数，无法被实例化
        private TestSingleton() {
	}
	private static TestSingleton ts = null;

	public static TestSingleton getInstance() {
		if (ts == null) {
			ts = new TestSingleton();
		}
		return ts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printInfo() {
		System.out.println("the name is " + name);
	}

}