//Armstrong num in java

/*
 
 153 -> 1 5 3
		1*1*1 + 5*5*5 + 3*3*3
		1 + 125 + 27
		153
	
 370 -> 3 7 0
		3*3*3 + 5*5*5 + 0
		27 + 343 + 0
		370 
		*/
		
public class ArmstrongNumber{
 public static void main(String [] args){
 
 int n=153;
 int temp= n;
 int r;
 int sum=0;
 
 while(n>0)
 {
  r = n%10;
  n = n/10;
  sum = sum + r*r*r;
  }
  if (temp == sum)
  System.out.println("The number is an Armstrong Number");
  else
  System.out.println("The number is not an Armstrong Number");
  }
  }
 