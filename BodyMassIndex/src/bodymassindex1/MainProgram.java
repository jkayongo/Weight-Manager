package bodymassindex1;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String userName = myScanner.nextLine();
		System.out.println(userName);
		System.out.println("Enter your height");
		double userHeight = myScanner.nextDouble();
		System.out.println(userHeight);
		System.out.println("Enter your weight");
		double userWeight = myScanner.nextDouble();
		System.out.println(userWeight);
		BMICalculator user = new BMICalculator();
		double userHeightInMetersSquared2 = user.convertCmToMetersSquared(userHeight);
		System.out.println(user.calculateBMI(userHeightInMetersSquared2, userWeight));
		double bmi2 = user.calculateBMI(userHeightInMetersSquared2, userWeight);
		user.printBMIReading(bmi2);


				
		
		
	}

}
