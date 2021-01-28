package primeNumberChallenge;

import java.util.Scanner;

public class PimeNumberCheck {
	
	private static Scanner input;

	public static boolean isPrime(int num) {
		if(num <= 1)        // 1 is neither prime nor composite..
			return false;
		
		for(int i=2;i*i<=num;i++) {   // To know whether a number is prime or not we can check 
										//  only from 2 to square_root(n)... statement in math
			if(num%i==0)
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		System.out.print("Please insert an integer : ");
		int num = input.nextInt();  // Reading input from user..
		
		if(isPrime(num))  // calling isPrime function ..
			System.out.println(num+" is a prime number.");
		else
			System.out.println(num+" is not a prime number.");
		
	}

}
