https://course.acciojob.com/idle?question=7549e3ec-afda-49f1-a09d-45fd13e018e7

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Your code here
		int sum=0;
		int digit;
		while(n>0){
			digit=n%10;
		sum+=digit;
		n=n/10;
		}
		System.out.println(sum);
    }
}
