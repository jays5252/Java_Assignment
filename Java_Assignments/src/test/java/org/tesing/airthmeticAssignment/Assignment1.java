package org.tesing.airthmeticAssignment;

public class Assignment1 
{
	//((((10+2)+2)-2)*2)/2)
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
			Assignment1 asm = new Assignment1();
			int sum = asm.sum(10, 2);
			int sum2 = asm.sum(sum, 2);
			int sub = asm.sub(sum2, 2);
			int multi = asm.multi(sub, 2);
			int finalResult = asm.Div(multi, 2);
			System.out.println("Final Result ="+finalResult);
		}

}
