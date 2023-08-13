package org.tesing.loopAssignment;

import java.util.Scanner;

public class SwapNumberUsingThirdVariabl {

	public void NumberSwapUsingThirdVariabl(int a, int b) 
	{
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // Swapping using a third variable
        int c = a;
        a = b;
        b = c;
        
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value for a");
		int a = sc.nextInt();
		System.out.println("Pease enter the value for b");
		int b= sc.nextInt();
		SwapNumberUsingThirdVariabl swap = new SwapNumberUsingThirdVariabl();
		swap.NumberSwapUsingThirdVariabl(a, b);
		
	}
	 

}
