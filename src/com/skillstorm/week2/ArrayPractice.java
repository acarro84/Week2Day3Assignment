package com.skillstorm.week2;

public class ArrayPractice {

	public static void main(String[] args) {
		int[] numbers = { -1, -17, -17, -4, -5 };

		System.out.println("The maximum value in numbers[] is: " + findMaxImproved(numbers));
		System.out.println("The maximum value in numbers[] is: " + findMaxImproved(null));
		System.out.println("The minimum value in numbers[] is: " + findMin(numbers));
		System.out.println("The minimum value in numbers[] is: " + findMin(null));
		
		

	}

	public static int findMaxImproved(int[] numbers) {

		int index = 0;
		int max = Integer.MIN_VALUE;
		if (numbers == null || numbers.length <= 0) // preferred way to do null check and length check
			return Integer.MIN_VALUE;
		else {
		while (index < numbers.length) {
			max = Math.max(max, numbers[index]);
			index++;
		}
		
		return max;
		}
	}
	public static int findMin(int[] numbers) {
		int index = 0;
		int min = Integer.MAX_VALUE;
		if (numbers == null || numbers.length <= 0) 
			return Integer.MAX_VALUE;
		else {
			while (index < numbers.length) {
				min = Math.min(min,  numbers[index]);
				index++;
			}
			
		
		return min;
		}
		
	}
	

}
