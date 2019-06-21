package com.and.test;

public class RecursivePermutation
{
	
	public String printPermutations(int[] integerArray)
	{
		String returnString = printPermutationRecursive(integerArray, integerArray.length).toString();
		returnString = returnString.substring(0, returnString.length()-1);
		
		return returnString;
	}
	
	private String printPermutationRecursive(int[] integerArray, int numberOfElements)
	{
		String returnString = new String();
		
		if (numberOfElements == 1)
		{
			for (int i = 0; i < integerArray.length; i++)
			{				
				returnString += integerArray[i];
			}
			return returnString += ",";
			
		}
		else
		{
			for(int i = 0; i < numberOfElements-1; i++)
			{
				returnString += printPermutationRecursive(integerArray, numberOfElements-1);
				if(numberOfElements % 2 == 0)
				{
					swap(integerArray, i, numberOfElements-1);
				}
				else
				{
					swap(integerArray, 0, numberOfElements-1);
				}
				
			}
			returnString += printPermutationRecursive(integerArray, numberOfElements-1);
			
		}
		
		return returnString;
	}
	
	private void swap(int[] integerArray, int elementA, int elementB)
	{
		int temp = integerArray[elementA];
		integerArray[elementA] = integerArray[elementB];
		integerArray[elementB] = temp;
	}
}
