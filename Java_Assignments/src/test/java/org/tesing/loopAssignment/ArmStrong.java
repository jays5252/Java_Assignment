package org.tesing.loopAssignment;

import java.util.Scanner;

public class ArmStrong 
{  
    // Function to check if a number is Armstrong
    static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int numDigits = countDigits(num);
        
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }
        
        return originalNum == sum;
    }
    
    // Function to count the number of digits in a number
    static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
		
	}
    public static void main(String[] args) 
	{
    	Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number");
		int num =sc.nextInt(); // Replace this with the number you want to check
        
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

}
