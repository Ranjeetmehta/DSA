import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0){
			System.out.println("Number is positive");
		}
		else if(num<0){
			System.out.println("Number is negative");
		}
	}
}
