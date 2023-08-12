package org.tesing.methodAssignment;

public class MethodAssignment 
{
//		three parameterized method
//		default method
//		one parameterized method
//		two parameterized method
//		four parameterized method

		public void Method()
		{
			this.Method3(0,0,0);
			System.out.println("Default parameterized Method");
		}
		public void Method1(int a)
		{
			this.Method();
			System.out.println("One parameterized Method");
		}
		public void Method2(int a, int b)
		{
			this.Method1(0);
			System.out.println("Two parameterized Method");
		}
		public void Method3(int a,int b,int c)
		{
			System.out.println("Three parameterized Method");
		}
		public  void Method4(int a,int b,int c, int d)
		{
			this.Method2(0, 0);
			System.out.println("Four parameterized Method");
		}
		public static void main(String[] args) 
		{
			MethodAssignment ma = new MethodAssignment();
			ma.Method4(0, 0, 0, 0);
		}
		
}
