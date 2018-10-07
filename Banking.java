/*********COMMONSERVICE.JAVA**********/
package com.ngtlearning;

public class CommonService {
	private float percent(float number, float percentage){
		return number * (percentage/100);
	}
	
	public float simpleInterest(float deposit, float rate, float time){
		return deposit + deposit*percent(1,rate)*time;
	}
	
	public float compoundInterest(float deposit, float rate, float time)
	{
		return (float) (deposit * Math.pow(1 + percent(1,rate),time));
	}
	
	public float areaTriangle (float base, float height){
		return (base * height)/2;
	}
public float tip(float billAmount,float tipPercent){
	return billAmount * (tipPercent/100);
}
}
/***********BANK.JAVA**********/
package com.ngtlearning;
import java.util.Scanner;

public class Bank extends CommonService {

	public static void main(String[] args) {
		int deposit;
		int rate;
		int time;
		Scanner s = new Scanner (System.in);
		System.out.println("Enter 1 for Simple Interest " + "or two for Compound Interest" + " or 0 to quit");
		int option = s.nextInt();
		
		if (option == 0) {
			System.out.println("Program terminated. Join again.");
			s.close();
			System.exit(0);
		}
		else if (option > 2){
			System.out.println("Invalid Selection!!");
		}
		
		else {
			CommonService commonClass = new CommonService();
			System.out.println("Enter Initial Deposit Amount: ");
			deposit = s.nextInt();
			System.out.println("Enter Interest Rate: ");
			rate = s.nextInt();
			System.out.println("Enter Duration (Years): ");
			time = s.nextInt();
			if (option == 1)
				
			{
				float simpleInterest = commonClass.simpleInterest(deposit,rate,time);
				System.out.println("Total amount with Simple Interest in account after " + time + " years "+ "= $" +simpleInterest);
			}
			else if (option == 2)
			{
				float compoundInterest = commonClass.compoundInterest(deposit, rate, time);
				System.out.println("Total amount with Compound Interest in account after "+ time+ " years " + "= $"+compoundInterest);
				}
		}
		main(null);

	}

}
