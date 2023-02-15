package com.practice;

public class Reverse {

	public static void main(String[] args) {
		int number=1234;
		int reverse;
		StringBuilder str=new StringBuilder(String.valueOf(number));
		reverse=Integer.valueOf(str.reverse().toString());
		System.out.println("Reverse number:"+reverse);

	}

}
