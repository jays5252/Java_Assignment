package org.tesing.loopAssignment;

import java.util.Scanner;

public class Factorial 
{
	static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number");
		int number = sc.nextInt();
		long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
		
	}
}
