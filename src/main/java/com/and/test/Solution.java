package com.and.test;

public class Solution
{

	/**
	 * The following is the method where the solution shall be written
	 */

	public static String solution(String input) throws NumberFormatException
	{
		StringParser stringParser = new StringParser();
		RecursivePermutation recursivePermutation = new RecursivePermutation();

		int[] integerArray = stringParser.parseString(input);
		
		if(integerArray.length == 0)
		{
			throw new NumberFormatException("Invalid Input " + input);
		}
		
		System.out.println("\nInput : " + input + "\nreturns : " + recursivePermutation.printPermutations(integerArray));

		return "Finished";

	}

	public static void main(String args[])
	{
		solution("326");
		
		solution("A2D4%3");
		
		//test specified that this should return an exception as opposed to an error message
		solution("ABC");
		
	}

}
