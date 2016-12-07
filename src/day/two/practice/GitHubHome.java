package day.two.practice;

import java.util.ArrayList;

public class GitHubHome {

	public static void main(String[] args) {

		System.out.println(getEvenList(21));

		System.out.println(getOddList(18));

		System.out.println(getKilo(10));

		System.out.println(getSameText("This is a String"));

		System.out.println(getLowerText("HOW ARE YOU?"));

		String text = "Selenium practice at home";
		System.out.println(getIndexList(text));

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
