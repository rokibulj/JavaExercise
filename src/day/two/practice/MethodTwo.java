package day.two.practice;

import java.util.ArrayList;

public class MethodTwo {

	public static void main(String[] args) {

		System.out.println(getEvenList(21));
		
		System.out.println(getOddList(18));

	}

	/**
	 * Write a method that take one number input and return the list of all even
	 * number from 0 to that given number.
	 */

	public static ArrayList<Integer> getEvenList(int number) {
		ArrayList<Integer> evenList = new ArrayList<Integer>();

		for (int i = 0; i <= number; i++) {

			if (i % 2 == 0) {

				evenList.add(i);
			}
		}

		return evenList;
	}
	
	/**
	 * Write a method that take one number input and return the list of all odd
	 * number from 0 to that given number.
	 */
	
	public static ArrayList<Integer> getOddList(int number) {
		ArrayList<Integer> oddList = new ArrayList<Integer>();

		for (int i = 0; i <= number; i++) {

			if (i % 2 == 1) {

				oddList.add(i);
			}
		}

		return oddList;
	}

}
