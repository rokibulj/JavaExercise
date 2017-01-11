package day.two.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class GitHubHome {

	public static void main(String[] args) {

		System.out.println("Ans#02. " + getEvenList(21));
		System.out.println("Ans#03. " + getOddList(18));
		System.out.println("Ans#04. " + getKilo(10));
		System.out.println("Ans#05. " + getSameText("This is a String"));
		System.out.println("Ans#06. " + getLowerText("HOW ARE YOU?"));

		String text = "Selenium practice at Home";
		System.out.println("Ans#07. " + getIndexList(text));
		System.out.println("Ans#08. " + getCharactersList(text));
		System.out.println("Ans#09. " + getSum(20));
		System.out.println("Ans#10. " + getSquare(20));
		System.out.println("Ans#11. " + Arrays.toString(getArray(13)));
		System.out.println("Ans#12. " + getGivenNumberList(20));
		System.out.println("Ans#13. " + getStatementReturn(25));

		int[] numberArray = { 1, 4, 9, 8, 3 };
		System.out.println("Ans#14. " + getMaxNumber(numberArray));
		System.out.println(("Ans#15. " + getMinNumber(numberArray)));
		System.out.println("Ans#16. " + getString(16));
		System.out.println("Ans#17. " + getInteger("34"));
		System.out.println("Ans#18. " + getStatement(text));
		System.out.println("Ans#19. " + getIndexSum(text));
		System.out.println("Ans#20. " + getLastFiveCharList(text));
		System.out.println("Ans#21. " + getFirstFiveChar(text));
		System.out.println("Ans#22. " + getFithToTenChar(text));
		System.out.println("Ans#23. " + getAllWordList(text));
		System.out.println("Ans#24. " + getFirstWord(text));
		System.out.println("Ans#25. " + getWordCheck(text, "we"));
		System.out.println("Ans#26. " + getConsonantCount(text));
		System.out.println("Ans#27. " + getVowelCount(text));
		System.out.println("Ans#28. " + getUppercaseCount(text));
		System.out.println("Ans#29. " + getCharCountWithoutWhiteSpace(text));
		System.out.println("Ans#30. " + getAllRepeatedChar(text));

	}

	/**
	 * Mhd # 30. Write a method that take one String input and return all
	 * repeated characters. Input/Parameter : String text. Output/Return type :
	 * String. Serving Bucket : Variable.
	 */

	public static String getAllRepeatedChar(String text) {
		String repeatedChar = "";
		text = text.toLowerCase();
		for (int i = 0; i < text.length(); i++) {
			for (int j = i + 1; j < text.length(); j++) {
				if(text.charAt(i) == text.charAt(j)) {
					if(!repeatedChar.contains(String.valueOf(text.charAt(i)))){
						repeatedChar = repeatedChar + text.charAt(i);
					}
				}
			}
		}

		return repeatedChar;
	}

	/**
	 * Mhd # 29. Write a method that take one String input and return the count
	 * of all characters without whitespace. Input/Parameter : String text.
	 * Output/Return type : Integer. Serving Bucket : Variable.
	 */

	public static int getCharCountWithoutWhiteSpace(String text) {
		int charCount = 0;
		String newText = text.replace(" ", "");
		for (int i = 0; i < newText.length(); i++) {
			charCount++;
		}

		return charCount;
	}

	/**
	 * Mhd # 28. Write a method that take one String input and return the count
	 * of all uppercase characters. Input/Parameter : String text. Output/Return
	 * type : Intrger. Serving Bucket : Variable.
	 */

	public static int getUppercaseCount(String text) {
		int uppercaseCount = 0;
		String allUppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < text.length(); i++) {
			String characters = String.valueOf(text.charAt(i));
			if (allUppercase.contains(characters)) {
				uppercaseCount++;
			}
		}

		return uppercaseCount;
	}

	/**
	 * Mhd # 27. Write a method that take one String input and return the count
	 * of all vowels. Input/Parameter : String text. Output/Return type :
	 * Integer. Serving Bucket : Variable.
	 */

	public static int getVowelCount(String text) {
		int vowelCount = 0;
		text = text.toLowerCase();
		String vowel = "aeiou";
		for (int i = 0; i < text.length(); i++) {
			if (vowel.contains(String.valueOf(text.charAt(i)))) {
				vowelCount++;
			}
		}

		return vowelCount;
	}

	/**
	 * Mhd # 26. Write a method that take String input and return the count of
	 * all consonant. Input/Parameter : String text. Output/Return type :
	 * Integer. Serving Bucket : Variable.
	 */

	public static int getConsonantCount(String text) {
		int consonantCount = 0;
		text = text.toLowerCase();
		String allConsonant = "bcdfghjklmnpqrstvwxyz";
		for (int i = 0; i < text.length(); i++) {
			if (allConsonant.contains(String.valueOf(text.charAt(i)))) {
				consonantCount++;
			}
		}

		return consonantCount;
	}

	/**
	 * Mhd # 25. Write a method that take one String and one word input and
	 * return true if that sentence contains given word otherwise return false
	 * Input/Parameter : String text, String textOne Output/Return type :
	 * boolean Serving Bucket : Variable
	 */

	public static boolean getWordCheck(String text, String word) {
		boolean wordCheck = false;
		String[] wordArray = text.split(" ");
		for (int i = 0; i < wordArray.length; i++) {
			if (wordArray[i].equalsIgnoreCase(word)) {
				wordCheck = true;
			}
		}

		return wordCheck;
	}

	/**
	 * Mhd # 24. Write a method that take one String input and return first
	 * word. Input/Parameter :String Output/Return type : String Serving Bucket
	 * : Variable.
	 */

	public static String getFirstWord(String text) {
		String firstWord = null;
		String[] wordArray = text.split(" ");
		firstWord = wordArray[0];

		return firstWord;
	}

	/**
	 * Mhd # 23. Write a method that take one String input and return a list of
	 * all word. Input/Parameter : String text. Output/Return type :
	 * ArrayList<String> Serving Bucket : List
	 */

	public static ArrayList<String> getAllWordList(String text) {
		ArrayList<String> allWordList = new ArrayList<String>();
		String[] wordArray = text.split(" ");
		// System.out.println(Arrays.toString(wordArray));
		for (int i = 0; i < wordArray.length; i++) {
			allWordList.add(wordArray[i]);
		}

		return allWordList;
	}

	/**
	 * Mhd # 22. Write a method that take one String input and return fifth to
	 * tenth characters as a String. Input/Parameter : String text.
	 * Output/Return type : String. Serving Bucket : Variable.
	 */

	public static String getFithToTenChar(String text) {
		String fithToTenChar = null;
		for (int i = 4; i <= 9; i++) {
			fithToTenChar = fithToTenChar + String.valueOf(text.charAt(i));
		}

		return fithToTenChar;
	}

	/**
	 * Mhd # 21. Write a method that take input one String and return a List of
	 * first five characters. Input/Parameter :String text. Output/Return type :
	 * ArrayList<Character> Serving Bucket : List.
	 */

	public static ArrayList<Character> getFirstFiveChar(String text) {
		ArrayList<Character> firstFiveChar = new ArrayList<Character>();
		for (int i = 0; i <= 4; i++) {
			firstFiveChar.add(text.charAt(i));
		}

		return firstFiveChar;
	}

	/**
	 * Mhd # 20. Write a method that take one String input and return a List of
	 * last five characters. Input/Parameter :String text. Output/Return type
	 * :ArrayList<Character> Serving Bucket : List
	 */

	public static ArrayList<Character> getLastFiveCharList(String text) {
		ArrayList<Character> lastFiveCharList = new ArrayList<Character>();
		for (int i = text.length() - 5; i < text.length(); i++) {
			lastFiveCharList.add(text.charAt(i));
		}

		return lastFiveCharList;
	}

	/**
	 * Mhd # 19. Write a method that take one String input and return the sum of
	 * all index. Input/Parameter : String text. Output/Return type : Integer.
	 * Serving Bucket : Variable.
	 */

	public static int getIndexSum(String text) {
		int indexSum = 0;
		for (int i = 0; i < text.length(); i++) {
			indexSum = indexSum + i;
		}

		return indexSum;
	}

	/**
	 * Mhd # 18. Write a method that take String input & return true if it
	 * contains char 'a'. Otherwise return false; Input/Parameter : Sting text.
	 * Output/Return type : boolean. Serving Bucket : Variable
	 */

	public static boolean getStatement(String text) {
		boolean statement = false;
		text = text.toLowerCase();
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'a') {
				statement = true;
			}
		}
		return statement;
	}

	/**
	 * Mhd # 17. Write a method that take input a String which representation a
	 * number and return the same value as Integer. Input/Parameter :String
	 * number. Output/Return type : Integer Serving Bucket : Variable
	 */

	public static int getInteger(String number) {
		int asInt = 0;
		asInt = Integer.valueOf(number);
		// System.out.println(asInt + asInt);
		return asInt;
	}

	/**
	 * Mhd # 16. Write a method that take one number input and return the same
	 * value as string. Input/Parameter : int number. Output/Return type :
	 * string Serving Bucket : Variable
	 */

	public static String getString(int number) {
		String asString = null;
		asString = String.valueOf(number);
		return asString;
	}

	/**
	 * Mhd # 15. Write a method that take input one number Array and return the
	 * minimum number. Input/Parameter :int[] numberArray. Output/Return type :
	 * Integer Serving Bucket : Variable.
	 */

	public static int getMinNumber(int[] numberArray) {
		int minNumber = numberArray[0];
		for (int i = 0; i < numberArray.length; i++) {
			if (minNumber > numberArray[i]) {
				minNumber = numberArray[i];
			}
		}

		return minNumber;
	}

	/**
	 * Mhd # 14. Write a method that take input one number Array and return the
	 * maximum number. Input/Parameter :int[] numberArray. Output/Return type :
	 * Integer Serving Bucket : Variable.
	 */

	public static int getMaxNumber(int[] numberArray) {
		int maxNumber = numberArray[0];
		for (int i = 0; i < numberArray.length; i++) {
			if (maxNumber < numberArray[i]) {
				maxNumber = numberArray[i];
			}
		}

		return maxNumber;
	}

	/**
	 * Mhd # 13. Write a method that take one number input and return fizz if
	 * the given number divided by 5 and return buzz if the given number divided
	 * by 5 & 3. Otherwise return fizz buzz. Input/Parameter : int number.
	 * Output/Return type : String Serving Bucket : Variable.
	 */

	public static String getStatementReturn(int number) {
		String statement = null;
		if (number % 5 == 0 && number % 3 == 0) {
			statement = "buzz";
		} else if (number % 5 == 0) {
			statement = "fizz";
		} else {
			statement = "fizz buzz";
		}

		return statement;
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
	 * Mhd#07. Write a method that take one String input and return a list of
	 * all index.
	 */
	public static ArrayList<Integer> getIndexList(String text) {
		ArrayList<Integer> indexList = new ArrayList<Integer>();
		for (int i = 0; i < text.length(); i++) {
			indexList.add(i);
		}

		return indexList;
	}

	/**
	 * Mhd#06. Write a method that take one String input and return same String
	 * in lowerCase.
	 */
	public static String getLowerText(String text) {
		String lowerText = "";
		lowerText = text.toLowerCase();
		return lowerText;
	}

	/**
	 * Mhd#05. Write a method that take one String input and return same String
	 * in upperCase.
	 */
	public static String getSameText(String text) {
		String sameText = "";
		sameText = text.toUpperCase();
		return sameText;
	}

	/**
	 * Mhd#04. Write a method that take input as mile and return as kilometer.
	 */
	public static double getKilo(int number) {
		double kilo = 0;
		kilo = number * 1.6;
		return kilo;
	}

	/**
	 * Mhd#02. Write a method that take one number input and return the list of
	 * all even number from 0 to that given number.
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
	 * Mhd#03. Write a method that take one number input and return the list of
	 * all odd number from 0 to that given number.
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
