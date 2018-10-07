package com.ngtlearning;


public class Arrays {
	int[] myArray = new int[11];

	public static void main(String[] args) {
		Arrays myArraysObject = new Arrays();
		myArraysObject.genArray();
		myArraysObject.copyArray();
	}
	public void genArray()
	{
			for (int i = 0; i < myArray.length; i++)
			{
				myArray[i] = i;
			}
			System.out.println("Printing Original myArray...");
			for (int i = 0; i < myArray.length; i++)
			{
				System.out.print(myArray[i]+" ");
			}
			System.out.println("\n");

	}
	public void copyArray()
	{
		int[] mySecondArray = new int[10];
		//mySecondArray = myArray;
		for (int i = 0; i < mySecondArray.length; i++){
			mySecondArray[i] = myArray[i];
		}
		
		mySecondArray[6] = 25;
		System.out.println("Printing mySecondArray....");
		for (int i = 0; i < mySecondArray.length; i++){
			System.out.print(mySecondArray[i] + "  ");
		}
		System.out.println("\n");
		
		System.out.println("Printing myArray...");
		for (int i = 0; i <myArray.length; i++){
			System.out.print(myArray[i] + "  ");
		}
		
	}

}
