package com.practice;

import java.util.ArrayList;

public class MyThread  extends Thread{
	@Override
	public void run() {
		ArrayList list=new ArrayList();
		list.add("sanjay");
		list.add("Uttam");
		System.out.println(list);
	}

	
}
