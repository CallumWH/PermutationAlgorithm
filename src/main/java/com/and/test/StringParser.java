package com.and.test;

import java.util.ArrayList;
import java.util.List;

public class StringParser
{
	public int[] parseString(String inputString)
	{
		List<Integer> returnList = new ArrayList<Integer>();
		
		for(int i = 0; i < inputString.length(); i++)
		{
			String currentValue = inputString.substring(i, i+1);
			int extractedValue;
			
			try
			{
				extractedValue = Integer.parseInt(currentValue);
			}
			catch(Exception e)
			{
				continue;
			}
			
			returnList.add(extractedValue);
		}
		
		int[] returnArray = new int[returnList.size()];
		
		for(int i = 0; i < returnList.size(); i++)
		{
			returnArray[i] = returnList.get(i);
		}
		
		return returnArray;
	}
}
