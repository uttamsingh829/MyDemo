package com.practice;

public class MyThread1 {

	public static void main(String[] args) {
		ThreadDemo threadDemo=new ThreadDemo()	;
		threadDemo.start();
		for(int i=0;i<=10;i++) {
		System.out.println("Main thread");
	}
}
}
