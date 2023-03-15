import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc=new Scanner(System.in);
		double P=sc.nextDouble();
		double R=sc.nextDouble();
		double T=sc.nextDouble();
		double result = P*Math.pow((1+T/100),R);
		System.out.println("Compound interest = "+ result);
	}
}
