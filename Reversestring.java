import java.util.Scanner;
public class Reversestring{
public static void main(String [] args)
{
String x;
System.out.println("Enter string x:" );
    Scanner sc =new Scanner(System.in);
    x = sc.nextLine();

char y[] = x.toCharArray();
int size = y.length;
char a[] = new char[size];

int i=0;
while(i!=size)
{
 a[size-1-i] = y[i];
    ++i;
	}
	System.out.println(y);
	System.out.println(a);
	}
	}

