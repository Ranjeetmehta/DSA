import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc=new Scanner(System.in);
		String x=sc.next();
		String y=sc.next();
		int n=Integer.parseInt(x,2);
		int m=Integer.parseInt(y,2);
		int k=n+m;
		System.out.println(Integer.toBinaryString(k));
		// System.out.println(Integer.toBinaryString(m));
	}
}
