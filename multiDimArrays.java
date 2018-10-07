package com.ngtlearning;

public class MultiDimArray {

	public static void main(String[] args) {
		
		MultiDimArray mda = new MultiDimArray();
		mda.printMultiDimArray();
		}
	    public void printMultiDimArray()
	    {
	    	String [] [] names = { {"Mr. ", "Mrs. ", "Ms. "}, {"Synder", "Greens"} };
	    	System.out.println(names[0][0] + names[1][0]);//Mr. Snyder
	    	System.out.println(names[0][2] + names[1][1]);//Ms. Greens
	    }
	    
}
                    
