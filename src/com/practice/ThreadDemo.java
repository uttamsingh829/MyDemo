package com.practice;

import java.util.Iterator;

public class ThreadDemo extends Thread {

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Child thread");
		}
	}
	
}
