package org.tesing.loopAssignment;

import java.util.Scanner;

public class PrimeNumber 
{
	public void primeCheck(int a)
	{
	        boolean isPrime = true;
	        
	        if (a <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= Math.sqrt(a); i++) {
	                if (a % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }
	        
	        if (isPrime) {
	            System.out.println(a + " is a prime Number.");
	        } else {
	            System.out.println(a + " is not a prime Number.");
	        }
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value for a");
		int a = sc.nextInt();
		PrimeNumber prime= new PrimeNumber();
		prime.primeCheck(a);
		
	}

}
