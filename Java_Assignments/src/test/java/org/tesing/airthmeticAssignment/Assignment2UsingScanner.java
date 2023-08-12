package org.tesing.airthmeticAssignment;

import java.util.Scanner;

public class Assignment2UsingScanner 
{
	//(((((x1*x2)-x3)+x4)-x5)/x6)
		public int sum(int x1, int x2)
		{
			int Sum  = x1+x2;
			return Sum;
		}
		public int sub(int x1, int x2)
		{
			int sub  = x1-x2;
			return sub;
		}
		public int Multi(int x1, int x2)
		{
			int Multi  = x1*x2;
			return Multi;
		}
		public int Div(int x1, int x2)
		{
			int div  = x1/x2;
			return div;
		}
		public static void main(String[] args) {
			Assignment2UsingScanner ass = new Assignment2UsingScanner();
			Scanner s = new Scanner(System.in);
			System.out.println("Please enter the value for X1");
			int X1= s.nextInt();
			System.out.println("Please enter the value for X2");
			int X2= s.nextInt();
			int Sum = ass.sum(X1, X2);
			System.out.println("Please enter the value for X3");
			int X3 = s.nextInt();
			int Sum1 = ass.sum(Sum, X3);
			System.out.println("Please enter the value for X4");
			int X4=s.nextInt();
			int sub = ass.sub(Sum1, X4);
			System.out.println("Please enter the value for X5");
			int X5 = s.nextInt();
			int multi = ass.Multi(sub, X5);
			System.out.println("Please enter the value for X6");
			int X6 = s.nextInt();
			int Result = ass.Div(multi, X6);
			System.out.println("Final Result = "+Result);
	}

}
