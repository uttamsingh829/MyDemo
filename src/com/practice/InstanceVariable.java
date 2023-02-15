package com.practice;

public class InstanceVariable {

	 String s;
	 int x;
	 boolean b;

	 public static void main(String[] args) {
		 System.out.println(new InstanceVariable().b);
	  InstanceVariable instanceDemo = new InstanceVariable();
	 
	  System.out.println(instanceDemo.s);
	 System.out.println(instanceDemo.x);
	 System.out.println(instanceDemo.b);

	     }

	 }