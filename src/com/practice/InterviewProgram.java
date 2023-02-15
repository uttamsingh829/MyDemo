package com.practice;

import java.util.Random;

public class InterviewProgram {

	public static void main(String[] args) {
		Random random= new Random();
		random.ints(1,100).limit(10).sorted().forEach(System.out::println);

	}

}
