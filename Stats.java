package com.ngtlearning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MeanMedian {

	public static void main(String[] args) {
		double[] seq = {20, 34, 40.5, 49, 49, 43, 39, 36, 4};
		MeanMedian myObject = new MeanMedian();
		double mean = myObject.findMean(seq);
		System.out.println("Mean is: "+ mean);
		
		double median = myObject.findMedian(seq);
		System.out.println("Median is: " + median);
		
}

	double findMean(double[] number)
	{
		double mean = 0;
		for (int i = 0; i < number.length; i++ )
		{
			mean = mean + number[i];
			
		}
		mean = mean / number.length;
			
		return mean;
	}
	
	double findMedian(double[] number)
	{
		Arrays.sort(number);
		int space = 0;
		if(number.length %2 ==0) //if number of elements are even
		{
			double first = number[(number.length/2) - 1];
			double second = number [(number.length/2)];
			return (first + second)/2;
		} else
		{
			return number [ (number.length-1)/2];
		}
			
		
		}
	}
	
