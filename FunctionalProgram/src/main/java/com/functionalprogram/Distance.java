package com.functionalprogram;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value for x");
		int x = sc.nextInt();
		

		System.out.println("Enter value for y");
		int y = sc.nextInt();
		
		distanceCal(x, y);
		sc.close();
	}

	public static void distanceCal(int x,int y) {
		double distance = Math.sqrt(x*x + y*y);
		System.out.println("Distence from origin to points is " + distance);
	}
}