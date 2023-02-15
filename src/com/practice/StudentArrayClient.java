package com.practice;

import java.util.Iterator;

public class StudentArrayClient {

	public static void main(String[] args) {
		StudentArray[] studentArray=new StudentArray[4];
		studentArray[0]=new StudentArray(101, "Uttamsingh", 12345);
		studentArray[1]=new StudentArray(102, "pdsingh", 12346);
		studentArray[2]=new StudentArray(103, "msingh", 12347);
		studentArray[3]=new StudentArray(104, "singh", 12348);
		for(int i=0;i<studentArray.length;i++) {
			System.out.println(studentArray[i]);
		}

	}

}
