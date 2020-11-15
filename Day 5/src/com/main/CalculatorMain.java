package com.main;

import java.util.Scanner;

import com.pojo.Calculator;

/**
 * You are required to compute the power of a number by implementing a
 * calculator. Create a class MyCalculator which consists of a single method
 * long power(int, int). This method takes two integers, and , as parameters and
 * finds . If either or is negative, then the method must throw an exception
 * which says "". Also, if both and are zero, then the method must throw an
 * exception which says ""
 * 
 * For example, -4 and -5 would result in .
 * 
 * Complete the function power in class MyCalculator and return the appropriate
 * result after the power operation or an appropriate exception as detailed
 * above.
 * 
 * @author Kavya Madhurima
 *
 */

public class CalculatorMain {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			int p = sc.nextInt();
			Calculator calculator = new Calculator();
			try {
				System.out.println(calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		sc.close();

	}
}
