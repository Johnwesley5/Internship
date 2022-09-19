/*
	1 1 2 3 5 8 13 21 31.....N
	*/
	
	public class Fibanocci
	{
		public static void main(String [] args)
		{
		  int k=0;
		  int a=1;
		  int b=1;
		  System.out.print("1 1 ");
		  while(k<50)
		  {
		   k=a+b;
		   System.out.print(k +" ");
		   a=b;
		   b=k;
		   }
		   }
	}