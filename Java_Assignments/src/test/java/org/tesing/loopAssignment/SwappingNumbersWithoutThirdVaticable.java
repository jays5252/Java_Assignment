package org.tesing.loopAssignment;

import java.util.Scanner;

public class SwappingNumbersWithoutThirdVaticable 
{
	public void SwappingNumberSwappingWithoutThirdVaticable(int a, int b)
	{
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // Swapping without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;
        
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
		SwappingNumbersWithoutThirdVaticable swap = new SwappingNumbersWithoutThirdVaticable();
		swap.SwappingNumberSwappingWithoutThirdVaticable(a, b);
	}

}
