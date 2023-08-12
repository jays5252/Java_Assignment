package org.tesing.airthmeticAssignment;

public class Assignment2 
{
	//((((10/2)-2)-2)+2)*2)
		public int sum(int a, int b)
		{
			int sum = a+b;
			return sum;
		}
		public int sub(int a, int b)
		{
			int sub = a-b;
			return sub;
		}
		public int multi(int a,int b)
		{
			int multi = a*b;
			return multi;
		}
		public int Div(int a,int b)
		{
			int Div = a/b;
			return Div;
		}
		public static void main(String[] args) 
		{
			Assignment2 as = new Assignment2();
			int div = as.Div(10, 2);
			int sub = as.sub(div, 2);
			int sub2 = as.sub(sub, 2);
			int sum = as.sum(sub2, 2);
			int finalResult = as.multi(sum, 2);
			System.out.println("Final Result = "+finalResult);
			
			
		}

}
