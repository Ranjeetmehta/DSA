import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a*a)+(b*b)==(c*c)){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}
