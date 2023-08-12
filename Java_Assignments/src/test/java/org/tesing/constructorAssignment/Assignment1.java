package org.tesing.constructorAssignment;

public class Assignment1 
{
//	three parameterized constructor
//	default constructor
//	one parameterized consturctor
//	two parameterized constructor
//	four parameterized consturcor
	public Assignment1()
	{
		this(0,0,0);
		System.out.println("Default parameterized Constructor");
	}
	public Assignment1(int a)
	{
		this();
		System.out.println("One parameterized Constructor");
	}
	public Assignment1(int a, int b)
	{
		this(0);
		System.out.println("Two parameterized Constructor");
	}
	public Assignment1(int a,int b,int c)
	{
		System.out.println("Three parameterized Constructor");
	}
	public  Assignment1(int a,int b,int c, int d)
	{
		this(0, 0);
		System.out.println("Four parameterized Constructor");
	}
	public static void main(String[] args) 
	{
		Assignment1 ca = new Assignment1(0,0,00,00);
	}
	


}
