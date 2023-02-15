package com.practice;

public class InstanceDemo {
	String s;
	int x;
	boolean b;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceDemo demo=new InstanceDemo();
		System.out.println(demo.b);
		System.out.println(demo.s);
		System.out.println(demo.x);
		System.out.println(new InstanceDemo().b);

	}

}
