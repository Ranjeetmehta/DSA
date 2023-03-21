import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	private static int gcd(int a,int b){
		if(b==0) return a;
		return gcd(b,a%b);
	}
    public static int cpFact(int A, int B) {
        // your code here
		if(gcd(A,B)==1){
			return A;
		}
		while(gcd(A,B)!=1){
			A=A/gcd(A,B);
		}
		return A;
    }
  public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.print(cpFact(A, B));
	}
}
