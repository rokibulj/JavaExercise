package day.two.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class GitHubHome {

	public static void main(String[] args) {

		System.out.println(getEvenList(21));

		System.out.println(getOddList(18));

		System.out.println(getKilo(10));

		System.out.println(getSameText("This is a String"));

		System.out.println(getLowerText("HOW ARE YOU?"));

		String text = "Selenium practice at home";
		System.out.println(getIndexList(text));

		System.out.println(getCharactersList(text));

		System.out.println(getSum(20));

		System.out.println(getSquare(20));

		System.out.println(Arrays.toString(getArray(13)));

		System.out.println("Ans#12. " + getGivenNumberList(20));

	}

	/**
	 * Mhd # 12. Write a method that take one number input and return a number
	 * List starting from 0 to that given number. Input/Parameter : int number.
	 * Output/Return type : ArrayList<Integer> Serving Bucket : List.
	 */

	public static ArrayList<Integer> getGivenNumberList(int number) {
		ArrayList<Integer> givenNumberList = new ArrayList<Integer>();
		for (int i = 0; i <= number; i++) {
			givenNumberList.add(i);
		}

		return givenNumberList;
	}

	/**
	 * Mhd # 11. Write a method that take one number input and return an Array
	 * that contains 0 to given number.
	 */
	public static int[] getArray(int number) {
		int[] newArray = new int[number + 1];
		for (int i = 0; i <= number; i++) {
			newArray[i] = i;
		}

		return newArray;
	}

	/**
	 * Mhd # 10. Write a method that take one number input and return square of
	 * the given number.
	 */
	public static int getSquare(int number) {
		int square = 0;
		square = number * number;
		return square;
	}

	/**
	 * Mhd # 09. Write a method that take one number input & return the sum of 1
	 * to that given number.
	 */
	public static int getSum(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}

		return sum;
	}

	/**
	 * Mhd # 08. Write a method that take one String input and return a list of
	 * all characters.
	 */
	public static ArrayList<Character> getCharactersList(String text) {
		ArrayList<Character> charactersList = new ArrayList<Character>();
		for (int i = 0; i < text.length(); i++) {
			charactersList.add(text.charAt(i));
		}

		return charactersList;
	}

	/**
	 * Write a method that take one String input and return a list of all index.
	 */
	public static ArrayList<Integer> getIndexList(String text) {
		ArrayList<Integer> indexList = new ArrayList<Integer>();
		for (int i = 0; i < text.length(); i++) {
			indexList.add(i);
		}

		return indexList;
	}

	/**
	 * Write a method that take one String input and return same String in
	 * lowerCase.
	 */
	public static String getLowerText(String text) {
		String lowerText = "";
		lowerText = text.toLowerCase();
		return lowerText;
	}

	/**
	 * Write a method that take one String input and return same String in
	 * upperCase.
	 */
	public static String getSameText(String text) {
		String sameText = "";
		sameText = text.toUpperCase();
		return sameText;
	}

	/**
	 * Write a method that take input as mile and return as kilometer.
	 */
	public static double getKilo(int number) {
		double kilo = 0;
		kilo = number * 1.6;
		return kilo;
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
