package com.pojo;

/**
 * Given total runs scored and total overs faced as the input. 
 * Write a program to calculate the run rate with the formula,

Run rate= total runs scored/total overs faced.

Use BufferedReader class to get the inputs from user.

This program may generate Arithmetic Exception / NumberFormatException. 
Use exception handling mechanisms to handle this exception. Use a single catch block. 
In the catch block, print the class name of the exception thrown.

 * @author Kavya Madhurima
 */

import java.util.Scanner;

public class RunRate {
	Scanner sc = new Scanner(System.in);
	private int runs;
	private int balls;
	private float runRate;

	public void input() {
		try {
			System.out.println("Enter the total runs scored= ");
			runs = sc.nextInt();
			System.out.println("Enter the total overs faced= ");
			balls = sc.nextInt();
		} catch (NumberFormatException e) {
			System.out.println("Error Code: " + e);
			System.exit(0);
		}
	}

	public void compute() {
		runRate = (float) runs / balls;
		System.out.println("Current Run Rate :" + runRate);
	}
}