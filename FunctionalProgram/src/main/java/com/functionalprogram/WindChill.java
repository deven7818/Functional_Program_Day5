package com.functionalprogram;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		/*
		 * Taking user input for temperature and speed.
		 */
		Scanner no = new Scanner(System.in);

		System.out.println("Enter temperature in fehrenheit");
		double t = no.nextInt();
		System.out.println("Enter wind speed in miles per hour");
		double v = no.nextInt();
		no.close();
		windChillCalculation(t, v); // Calling method windChillCalculation
	}

	/*
	 * Method to calculate WindChill using t(temperature) and v(speed) as parameters
	 */
	public static double windChillCalculation(double t, double v) {
		if (t < 51 && v < 121 && v > 2) {
			double w = 35.74 + (0.6215 * t) + (0.4275 * t + 35.75) * Math.pow(v, 0.16);
			System.out.println("Wind Chill is " + w);
			return w;
		} else {
			System.out.println(
					"Please enter temperature less than 51 fehrenheit and wind speed in range of 3 to 120 miles per hours");
			return 0;
		}

	}
}