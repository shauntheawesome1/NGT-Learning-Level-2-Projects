/*********OWNERS.JAVA********/
package operators;

import vehicles.Car;

  class Owner {

	public static void main(String[] args) {
		Car mycar = new Car();
		System.out.println(mycar.doors);
		System.out.println(mycar.getSpeed());

	}

}

// THIS IS VEHICLES.JAVA NOW
/********CAR.JAVA*******/
package vehicles;

public class Car {
	
	 private int doors = 4;
	 int getSpeed ()
	 {
		 return 50;
		 
	 }
	 public static void main (String []args) {
		 Car mycar = new Car();
		 System.out.println(mycar.doors);
		 System.out.println(mycar.getSpeed());
	 }

}
/*********DEALERS.JAVA*********/
package vehicles;

 class Dealer {

	public static void main(String[] args) {
		Car dealerCar = new Car();
		System.out.println(dealerCar.doors);
		System.out.println(dealerCar.getSpeed());

	}

}
