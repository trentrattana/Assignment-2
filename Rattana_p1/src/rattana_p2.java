import java.util.Scanner;
import java.lang.Math;

public class rattana_p2 {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		/*
		 * create a bmi calculator
		 * provide the option for which formula to use
		 * display the BMI categories:
		 * Underweight < 18.5
		 * Normal = 18.5 - 24.9
		 * Overweight = 25 - 29.9
		 * Obese >= 30
		 */
		
		//variables
		double bmi, weightInPounds, heightInInches;
		double weightInKilos, heightInMeters;
		int choice;
		
		//US or metric
		System.out.println("Metric or US measuremnts? Press 1 for Metric and 2 for US.");
		choice = scnr.nextInt();
		
		//US choice
		if (choice == 1) {
			//user input
			System.out.println("Enter weight in pounds.");
			weightInPounds = scnr.nextDouble();
			System.out.println("Enter height in inches.");
			heightInInches = scnr.nextDouble();
			
			//BMI calculations
			bmi = (703 * weightInPounds) / Math.pow(heightInInches, 2);
			
			System.out.printf("Your BMI is: %.2f", bmi);
			
			//BMI categories
			if (bmi < 18.5) {
				System.out.println("You are underweight.");
			}
			else if (bmi >= 18.5 && bmi < 25) {
				System.out.println("You are normal.");
			}
			else if (bmi >= 25 && bmi < 30) {
				System.out.println("You are overweight.");
			}
			else if (bmi >= 30) {
				System.out.println("You are obese.");
			}
		}
		//Metric Choice
		else if (choice == 2) {
			//user input
			System.out.println("Enter weight in kilograms.");
			weightInKilos = scnr.nextDouble();
			System.out.println("Enter height in meters.");
			heightInMeters = scnr.nextDouble();
			
			//BMI calculations
			bmi = (weightInKilos) / Math.pow(heightInMeters, 2);
			
			System.out.printf("Your BMI is: %.2f", bmi);
			
			//BMI categories
			if (bmi < 18.5) {
				System.out.println("You are underweight.");
			}
			else if (bmi >= 18.5 && bmi < 25) {
				System.out.println("You are normal.");
			}
			else if (bmi >= 25 && bmi < 30) {
				System.out.println("You are overweight.");
			}
			else if (bmi >= 30) {
				System.out.println("You are obese.");
			}
		}
		//invalid choice
		else {
			System.out.println("Invalid choice. Re-run and choose 1 or 2.");
		}
	}
}

