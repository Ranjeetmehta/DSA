import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=0;
		while(n>0){
			n=n/5;
			fact+=n;
			
		}
		System.out.println(fact);
	}
}
