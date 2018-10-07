package com.ngtlearning;

import java.util.Scanner;

public class BinarytoDecimal {
	
	//static final double result =0;
	static double result = 0;
	static int toDecimal(String binary) {
		//return 0;
		char[] chars = binary.toCharArray();
		int place = binary.length()-1;
		for (int i = 0; i <= place; ++i)
		{
			if (chars[i] == '1')
result = result +(Math.pow(2,  place-i));
		}
		return (int) result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any binary number : ");
		String binNumber = s.next();
		
		
		
	    int decimalNumber = toDecimal(binNumber);
		System.out.println("The decimal value is: " + decimalNumber);
		s.close();
		

	}


}
