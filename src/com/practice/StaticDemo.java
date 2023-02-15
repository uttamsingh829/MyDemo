package com.practice;

import java.util.jar.Attributes.Name;

public class StaticDemo {
	
	int id;
	String name;
	static String collegeName ="GICTS";
	StaticDemo(int id,String name){
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		StaticDemo demo= new StaticDemo(101, "ravi");
		StaticDemo demo1= new StaticDemo(102, "uk");
		System.out.println(demo.id+" "+demo.name+" "+demo.collegeName);
		System.out.println(demo1.id+" "+demo1.name+" "+demo1.collegeName);
		
			
		}
	}


