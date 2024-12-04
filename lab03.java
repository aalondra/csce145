//Alondra Arredondo

package lab03;
import java.util.Scanner;

public class lab03 {

	public static final int VALUE = 99;
	public static void main(String[] args) {

		//company sells a software package for a retail price of $99
	
	 Scanner key = new Scanner(System.in);
		 	 
	 //Asking for imput 
	 System.out.println("Enter the total number of software packages ordered: ");
	 int number = key.nextInt();
	 
	//calculating total before 
	 int total = number * VALUE;
	 
	//checking for valid imput
	 if (number<0)
	  {
				 System.out.println("Invalid value for package count! Exiting the program!");
				 System.exit(0);
	 }
	 //when no discount is applied
	 else if(number<10)
	 {
		 System.out.println("Total Bill amount: $"+ total);
		 System.out.println("No discount is applied");
	 }
	 
	 //10-19- 20%
	 else if (number >10 && number <19)
	 {
	 double discount = total * 0.2;
	 double discounted = total - discount;
		 System.out.println("Total Bill Amount (before discount) = $"+ total);
		 System.out.println("Amount of discount= "+discount);
		 System.out.println("Total Bill Amount (after discount)= $ "+discounted);	
	 }
	 
	 //20-49 30%
	 else if  (number > 20 && number<49)
	 {
		double discount= total* .3;
		double discounted = total - discount;
		 System.out.println("Total Bill Amount (before discount) = $"+ total);
		 System.out.println("Amount of discount="+ discount);
		 System.out.println("Total Bill Amount (after discount)= $ "+discounted);
	 }
	 //50-99 40%
	 else if (number> 50 && number <99)
	 {
		double discount = total * .4;
		double discounted = total - discount;
		 System.out.println("Total Bill Amount (before discount) = $"+ total);
		 System.out.println("Amount of discount="+discount);
		 System.out.println("Total Bill Amount (after discount)= $ "+ discounted);
	 }
	 //100+ 50%
	 else if(number>=100)
	 {
		double discount = total *.5;
		double discounted = total - discount;
		 System.out.println("Total Bill Amount (before discount) = $"+ total);
		 System.out.println("Amount of discount= "+ discount);
		 System.out.println("Total Bill Amount (after discount)= $ "+ discounted);
	 }
		
	

	 
	}

}
