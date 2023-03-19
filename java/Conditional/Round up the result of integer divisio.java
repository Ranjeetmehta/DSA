import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc=new Scanner(System.in);
		int marks1=sc.nextInt();
		int marks2=sc.nextInt();
		
		int totalMarks=sc.nextInt();
		int percentage=((marks1+marks2)*100)/totalMarks;
		System.out.println(percentage+"%");
	}
}
