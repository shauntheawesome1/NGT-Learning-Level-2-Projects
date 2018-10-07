package com.ngtlearning;

import java.util.Scanner;
import java.util.Arrays;

public class EvenOddNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the ending number...: ");
		int lastNumber = s.nextInt();
		
		EvenOddNumbers myObject = new EvenOddNumbers();
		myObject.printEvenOdd(lastNumber);
		s.close();

	}
	public void printEvenOdd(int lastNumber) {
		int evenNumbers [] = new int[lastNumber/2];
		int oddNumbers [] = new int [lastNumber/2 + lastNumber%2];
		
		for (int i = 1; i <= lastNumber; i++){
			if (i%2 == 0){
				evenNumbers[i/2 -1] = i;
			}
			if (i%2 ==1){
				
				oddNumbers[i/2] = i;
				
			}
		}
		
		for (int j = 0; j < evenNumbers.length; j++){
			System.out.print(evenNumbers[j] + " ");
		}
		System.out.println("\n");
		
		for (int k = 0; k < oddNumbers.length; k++)
			System.out.print(oddNumbers[k] + " ");
		}
	
		
		
				
		
	}

	
	

