package com.revature.ex;

import java.util.Scanner;

public class driverTwo {
	public static void main(String[] args) {

		int i = 16;
		try {
			//#4
			functionThatThrowsException(i);
		} catch (Exception c) {
			System.out.println(c);
		}
	}

	// #3 
	public static void functionThatThrowsException(int i) {
		System.out.println("error");
	}
}

	
