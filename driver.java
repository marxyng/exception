package com.revature.ex;

import java.util.Scanner;

public class driver {
	
	public static void main(String[] args) {
		try {
			//block of code we want to try
			int[] partyPokemon = {1, 2, 3, 4, 5, 6};
			System.out.println(partyPokemon[8]);
		}
		
		catch(Exception e) {
			System.out.println("a party can only have 6 pokemon.");
		}
		
		finally {
			System.out.println("the finally statement has run successfull");
		}
	

	Scanner userObj = new Scanner(System.in);
	System.out.println("How many pokemon are in your party?");
	
	int party = userObj.nextInt();
	myException.checkPartySize(party);
	
	System.out.println("Who is your favorite Pokemon?");
	
	String myInput = userObj.nextLine();
	
	System.out.println("My favorite pokemon is " + myInput);
}
}
