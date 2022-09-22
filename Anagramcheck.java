import java.util.Scanner;
import java.util.Arrays;

public class Anagramcheck {
	public static void main(String [] args){
    String a;
    System.out.println("Enter string a:" );
    Scanner sc =new Scanner(System.in);
    a = sc.nextLine();

    String b;
    System.out.println("Enter string b:" );
    b = sc.nextLine();

    a = a.toLowerCase();
    b = b.toLowerCase();

    char x[] = a.toCharArray();
    char y[] = b.toCharArray();

    Arrays.sort(x);
    Arrays.sort(y);

    boolean result = Arrays.equals(x,y);
    if(result == true)
    {
        System.out.println("Strings are anagram");
    }
    else{
        System.out.println("Strings are not anagram");
    }
	}
}
