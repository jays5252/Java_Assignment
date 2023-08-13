package org.tesing.constructorAssignment;

public class Assignment2thisMethod 
{
//	three parameterized method
//	default method
//	one parameterized method
//	two parameterized method
//	four parameterized method
	public void DefaultMethod()
	{
		this.ThreeParameterizesMathod(1, 1, 1);
		System.out.println("Default Method");
	}
	public void OneParameterizesMathod(int a)
	{
		this.DefaultMethod();
		System.out.println("One Parameterizes Mathod Method");
	}
	public void TwoParameterizesMathod(int a, int b)
	{
		this.OneParameterizesMathod(1);
		System.out.println("Two Parameterizes Mathod Method");
	}
	public void ThreeParameterizesMathod(int a, int b, int c)
	{
		System.out.println("Three Parameterizes Mathod");
	}
	public void FourParameterizesMathod(int a, int b, int c, int d)
	{
		this.TwoParameterizesMathod(1, 1);
		System.out.println("Four Parameterizes Mathod");
	}
	public static void main(String[] args) 
	{
		Assignment2thisMethod method = new Assignment2thisMethod();
		method.FourParameterizesMathod(1,1,1,1);
	}

}
