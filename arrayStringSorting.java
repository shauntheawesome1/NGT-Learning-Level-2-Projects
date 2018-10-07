package com.ngtlearning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayStringSorting {
	

	public static void main(String[] args) {
		ArrayStringSorting arrStringSorting = new ArrayStringSorting();
		arrStringSorting.sortString();

	}

	public void sortString()
	
	{ String stringArray[] = {"john", "Jack", "Raj", "alex","Bill", "Phil", "Andy"};
			
	Arrays.sort(stringArray);
	System.out.println("Printing Sorted case sensitive stringArray...");
	for (int i = 0; i < stringArray.length; i++)
	{ 
		System.out.print(stringArray[i]+ " ");
	}
	Arrays.sort(stringArray, String.CASE_INSENSITIVE_ORDER);
	System.out.println("\n");
	System.out.println("Printing Sorted case insensitive stringAraay...");
	for (int i = 0; i < stringArray.length; i++)
	{
		System.out.print(stringArray[i] + " ");
	}
	}
}

