https://course.acciojob.com/idle?question=9ef94e36-a784-4dbf-bf74-b76cb9c5fb04


import java.io.*;
import java.util.*;
public class Main {
    public static int fib(int n){
        //Write code here
		if(n==0) return 0;
		if(n==1) return 1;
		return fib(n-1)+fib(n-2);
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(fib(n));
    }
}
