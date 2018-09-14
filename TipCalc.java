import java.util.*;

//Nicole Olson
//6-12-18

public class TipCalc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Please input the amount you paid.");
		double amountPaid = input.nextDouble();
		if(amountPaid > 0) {
			System.out.println("Please input if the service recieved was \"poor\", \"ok\", \"good\" or \"great\".");
			String serviceQuality = input.next();
			double tipAmount = 00.00;
			double total = amountPaid + tipAmount;
		switch (serviceQuality.toLowerCase()) {
		case "poor": //10%
			tipAmount = amountPaid * .10;
			total = tipAmount + amountPaid;
			System.out.printf("The tip is $%.2f. ", tipAmount);
			System.out.printf("\nWe're very sorry you had poor service. Please contact a manager to let them know how we could improve your experience! Your total is $%.2f.", total);
			break;
		case "ok": //15%
			tipAmount = amountPaid * .15 ;
			total = tipAmount + amountPaid;
			System.out.printf("The total is $%.2f. ", tipAmount);
			System.out.printf("\nPlease contact a manager to let them know how we could improve your experience! Your total is $%.2f.", total);
			break;
		case "good": //20%
			tipAmount = amountPaid * .20 ;
			total = tipAmount + amountPaid;
			System.out.printf("The tip is $%.2f. ", tipAmount);
			System.out.printf("\nPlease contact a manager to let them know how we could improve your experience! Your total is $%.2f.", total);
			break;
		case "great": //25%
			tipAmount = amountPaid * .25 ;
			total = tipAmount + amountPaid;
			System.out.printf("The tip is $%.2f. ", tipAmount);
			System.out.printf("\nYour total is $%.2f.", total);
			break;
		default:
			System.out.println("Invalid input. Please try again.");
												}
							}
		else {
			System.out.println("You entered a negative amount for your amount paid. Please enter a positive amount.");
		}
		input.close();
			
	}

}
