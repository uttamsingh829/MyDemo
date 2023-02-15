package com.practice;

public class ReverseString {

	public static void main(String[] args) {
		String s="Uttam singh Kushwah";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		String[] strArr = s.split(" ");
		System.out.println("There are "+strArr.length+" words in given string.");
		for (int i = 0; i < strArr.length; i++) {
			String string = strArr[i];
			System.out.println(string);
		}
	}

}
