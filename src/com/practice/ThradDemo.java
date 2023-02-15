package com.practice;

import java.util.LinkedList;

public class ThradDemo {

	public static void main(String[] args) {
		MyThread thread=new MyThread();
		thread.start();
		LinkedList linkedList= new LinkedList();
        linkedList.add(101);
        linkedList.add(102);
        System.out.println(linkedList);
	}

}
