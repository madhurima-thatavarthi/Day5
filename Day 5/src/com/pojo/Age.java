package com.pojo;

/**
 * Write a program to get the name and age of the player from the user and
 * display it.
 * 
 * player name is a string
 * 
 * player age is an integer value
 * 
 * Note : The player is eligible to participate in IPL when their age is 19 and
 * above
 * 
 * This program may generate
 * 
 * 1. InvalidAgeRange Custom Exception when the player's age is below 19
 * 
 * Use exception handling mechanisms to handle these exceptions
 * 
 * Create a class called CustomException which extends Exception and it includes
 * constructor to initialize the message.
 * 
 * Use appropriate exception handling mechanisms to handle these exceptions
 * 
 * @author Kavya Madhurima
 *
 */

@SuppressWarnings("serial")
public class Age extends Exception {
	Age(String s) {
		super(s);
	}
}