package com.ngtlearning;

public class BubbleSort {

	public static void main(String[] args) {
		int numberArray[] = {2,5,11,7,89,54,22,67};
		
		for (int j = 0; j < numberArray.length; j++){
			
			for (int i = 0; i < numberArray.length-1; i++){
				int tempNumber=0;
				if(numberArray[i] > numberArray[i + 1]) {
					tempNumber = numberArray[i + 1];
					numberArray[i + 1] = numberArray[i];
					numberArray[i] = tempNumber;
				}
				
			}
		}
		System.out.println("Sorted list is: ");
		for (int i = 0; i< numberArray.length; i++) {
			System.out.print(numberArray[i] + " ");
		}
	}

}
