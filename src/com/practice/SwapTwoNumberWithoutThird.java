package com.practice;

public class SwapTwoNumberWithoutThird {

	public static void main(String[] args) {
		int a= 10;
		int b= 20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("first number after swap:"+a);
		System.out.println("second number after swap:"+b);
	}

}
