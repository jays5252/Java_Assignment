package org.tesing.loopAssignment;

import java.util.Scanner;

public class Palindrome 
{
	public void PalindromeCheck (int num)
	{
		 
		if (isPalindrome(num)) 
			{
		    	System.out.println(num + " is a palindrome number.");
			} 
		else
			{
		        System.out.println(num + " is not a palindrome number.");
			}
	}
    
    // Function to check if a number is palindrome
    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        
        return originalNum == reversedNum;
	}
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value for a");
		int a = sc.nextInt();
		Palindrome pad = new Palindrome();
		pad.PalindromeCheck(a);
		
	}

}
