package com.ngtlearning;


import java.util.Scanner;
 
class PrimeNumbers {
	static String classInstance; //Class Variable
	String instance = null; // Instance variable
	public static void main(String[] args) {
		
		int number1, number2; //Local Variable
		Scanner in; //Local Variable
		in = new Scanner(System.in);
		System.out.println("Enter upper limit for first prime number series: ");
		number1 = in.nextInt();
		
		System.out.println("Enter upper limit for second prime number series: ");
		number2 = in.nextInt();
		
		if ((number1 < 2) ||  (number2 < 2)){
			System.out.println("Please enter both numbers greater than 1");
			System.exit(0);
		}
		PrimeNumbers primeNumbersInstance1 = new PrimeNumbers("Instance1");
		PrimeNumbers primeNumbersInstance2 = new PrimeNumbers("Instance2");
		primeNumbersInstance1.printPrimeNumber(number1);
		primeNumbersInstance2.printPrimeNumber(number2);
		in.close();
		

		
		

	}
	public PrimeNumbers(String inst)
	{
		instance = inst;
		classInstance = inst;
	}
	public void printPrimeNumber(int limit)
	{
		boolean isPrime = true; //Local Variable
		System.out.println("ClassInstance: " +classInstance);
		System.out.println("Instance: "+instance);
		System.out.println("All the prime numbers <= " +limit+ " are :-");
		
		for ( int count = 2 ; count <=limit ; ++count)
		{
			for (int j = 2; j < count ; j++ )
			{
				if (count%j == 0 ) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
			{
				}
		isPrime = true;	
		}
		System.out.println("\n");
	}

}
