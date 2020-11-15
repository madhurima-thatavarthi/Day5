package com.main;

/**
 * .Java has built-in mechanism to handle exceptions. 
 * Using the try statement we can test a block of code for errors. 
 * The catch block contains the code that says what to do if exception occurs.
 * This problem will test your knowledge on try-catch block.
 *
 * You will be given two integers and as input, you have to compute . 
 * If and are not bit signed integers or if is zero, exception will occur and you have to report it. 
 * Read sample Input/Output to know what to report in case of exceptions.
 *
 * @author-Kavya Madhurima
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			try {
				int x = new Integer(sc.nextInt());
				int y = new Integer(sc.nextInt());
				System.out.println("" + (x / y));
			} catch (InputMismatchException e) {
				System.out.println("java.util.InputMismatchException");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		sc.close();
	}
}
