package com.test;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSingleton ts1=TestSingleton.getInstance();
		ts1.setName("mike");
		TestSingleton ts2=TestSingleton.getInstance();
		ts2.setName("niky");
		
		ts1.printInfo();
		ts2.printInfo();
		
		if(ts1==ts2){
			System.out.println("��������ͬһ��ʵ��");
		}else{
			System.out.println("�����Ĳ���ͬһ��ʵ��");
		}
		
	}

}
