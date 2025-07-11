/*
 * Daiji KUriakose
 * Cse - B
 * July 11, 2025
 * 
 * Q) Write a program in Java to check if the given number is palindrome                                                                            
 */



package main;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args){
		System.out.println("Enter the number");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int rev=0;
		int remainder;
		int origin=number;
		while(number>0) {
			remainder=number%10;
			rev=rev*10+remainder;
			number=number/10;
		}
		if(rev==origin) {
			System.out.println("the number "+origin +" is palindrome");
		}
		else {
			System.out.println("The number "+origin +" is not palindrome");
		}
	}
}
