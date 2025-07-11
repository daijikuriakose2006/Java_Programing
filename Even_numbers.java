/*
 * Daiji Kuriakose
 * Cse - B
 * July 11, 2025
 * 
 * Q) Write a program in Java to print even numbers upto a limit and find its sum.                                                                           
 */
package main;
import java.util.Scanner;
public class Even_numbers {
	public static void main(String[] args) {
		System.out.println("Enter the limit");
		Scanner scan=new Scanner(System.in);
		int limit=scan.nextInt();
		int sum=0;
		for(int i=2;i<=limit; i+=2) {
			System.out.println(i);
			sum+=i;
			
		}
		System.out.println("The sum is "+sum);
	}
}
