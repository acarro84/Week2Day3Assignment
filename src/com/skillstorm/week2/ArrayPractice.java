package com.skillstorm.week2;

public class ArrayPractice {

	public static void main(String[] args) {
		String[] myFavoriteFoods= {"pizza" , "pasta" , "jamabalaya" , "steak" , "barbecue"};
		
		System.out.println("My number 1 favorite food is: " + myFavoriteFoods[0] );
		System.out.println("My number 2 favorite food is: " + myFavoriteFoods[1] );
		System.out.println("My number 3 favorite food is: " + myFavoriteFoods[2] );
		System.out.println("My number 4 favorite food is: " + myFavoriteFoods[3] );
		System.out.println("My number 5 favorite food is: " + myFavoriteFoods[4] );
		myFavoriteFoods = new String [] {"salad" , "pasta" , "jamabalaya" , "steak" , "barbecue"};
		System.out.println("My new favorite food is " + myFavoriteFoods[0] + " because my doctor said to stop eating pizza.");
		
		
		

	}
	
}
