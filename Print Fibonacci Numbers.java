https://course.acciojob.com/idle?question=f1ef41f7-6b89-4d04-83e6-393e1af537b5

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
	
	//Write code here
	  int a=0;
	  int b=1;
	  int c;
	  // System.out.println(n);
	  for(int i=0;i<n;i++){
		    System.out.println(a);
		  c=a+b;
			a=b;
		  b=c;
	  }
	
  }
}
