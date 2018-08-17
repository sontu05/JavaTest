package com.abhi.java.main;

public class JavaStringTestMain {

	public static void main(String[] args) {
		String name1= new String ("Test");
		System.out.println("name1 ="+name1);
		
		StringBuffer nameSbuff= new StringBuffer("TestSBuff");
		System.out.println("nameSbuff ="+nameSbuff);
		
		StringBuilder nameSbld= new StringBuilder("TestSBuff");
		System.out.println("nameSbld ="+nameSbld);

	}

}
