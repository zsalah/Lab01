/*Retirement Calculator
 * By Zulfiqar Salahuddin, Gerson Garcia, Fatemeh Sedigh Haghighat
 * 
 * 
 * Retirement plan that calculates how much to save each month (pmt)
 * and return the future value(fv)
 */



package MainPackage;

import java.util.Scanner;

public class RetirementPlan {

	private static Scanner user_input;

	public static void main(String[] args) {
		
		user_input = new Scanner(System.in);
		
		/*years = how long to draw
		 * interest = average return
		 * interest_2 = second average return 
		 * years_draw = years plan to work
		 * income = required income
		 * social_S = social security
		 * fv = future value
		 * pmt = how much to save each month
		 */

		int years;
		float interest;
		float interest_2;
		int years_draw;
		double income;
		double social_S;
		double fv;
		double pmt;
		
		//Asks the users
		System.out.print("Enter how many years to work: ");
		years = user_input.nextInt();
		
		System.out.print("Enter interest for finding Present Value: ");
		interest = user_input.nextFloat();
		
		System.out.print("Enter interest for finding PMT: ");
		interest_2 = user_input.nextFloat();
		
		System.out.print("Enter years draw: ");
		years_draw = user_input.nextInt();
		
		System.out.print("Enter income: ");
		income = user_input.nextDouble();
		
		System.out.print("Enter Social-Security: ");
		social_S = user_input.nextDouble();
		
		//Write PV formula first
		
		fv = (income - social_S) * ((1-(1/Math.pow(1 + interest/12,(years*12)))))/(interest/12);
		
		System.out.println("The FV is: " + fv);
		
		double middle;
		middle = (1 + (interest_2/12));
		
		//System.out.println(middle);
		
		double finalExp;
		finalExp = (12 * years_draw);
		
		//System.out.println(finalExp);
		
		float denom;
		denom = (interest_2/12);
		
		//System.out.println(denom);
		
		double bottomFormula;
		bottomFormula = (Math.pow(middle, finalExp)) - 1;

		//System.out.println(bottomFormula);
		
		//Complete Formula For finding 
		//How much to save each month
		pmt = fv / (bottomFormula/denom);
		
		System.out.println("The PMT is: " + Math.round(pmt));
		
		
				
		
	}

}
