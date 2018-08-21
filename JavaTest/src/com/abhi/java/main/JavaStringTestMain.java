package com.abhi.java.main;

public class JavaStringTestMain {

	static int a=10;
	public static void main(String[] args) {
		String name1= new String ("Test");
		System.out.println("name1 ="+name1);
		System.out.println("value of a"+a);
		a++;
		StringBuffer nameSbuff= new StringBuffer("TestSBuff");
		System.out.println("nameSbuff ="+nameSbuff);
		System.out.println("value of a"+a);
		
		StringBuilder nameSbld= new StringBuilder("TestSBuff");
		System.out.println("nameSbld ="+nameSbld);

	}

}
