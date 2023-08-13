package org.tesing.loopAssignment;

import java.util.Scanner;

public class TableOfNrmber 
{
	public void printTable(int number)
	{
		for (int i=1;i<11;i++)
		{
			System.out.println(number+" X "+i+" = "+ number*i);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number");
		int number = sc.nextInt();
		TableOfNrmber table = new TableOfNrmber();
		table.printTable(number);
		
	}

}
