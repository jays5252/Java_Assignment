package org.tesing.loopAssignment;

import java.util.Scanner;

public class Fabonacci 
{
	 public void createFebonacci(int n)
	 {
	        System.out.println("Fibonacci series up to " + n + " terms:");
	        
	        int firstTerm = 0;
	        int secondTerm = 1;
	        
	        System.out.print(firstTerm + " " + secondTerm + " ");
	        
	        for (int i = 3; i <= n; i++) {
	            int nextTerm = firstTerm + secondTerm;
	            System.out.print(nextTerm + " ");
	            
	            firstTerm = secondTerm;
	            secondTerm = nextTerm;
	        }
	 }
	 public static void main(String[] args) 
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter any number");
		 int number = sc.nextInt();
		 Fabonacci fab = new Fabonacci();
		 fab.createFebonacci(number);
		 
	 }
}
