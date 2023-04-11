https://course.acciojob.com/idle?question=ad163b7c-8fea-42d3-a8e9-39d4d6a06b18



import java.io.*;
import java.util.*;

public class Main {
	static int isPalindrome(String str)
      {
              //write code here
		  str=str.toLowerCase();
		    str = str.replaceAll("[^a-z]", "");
		  int i=0,j=str.length()-1;
		  while(i<j){
			  if(str.charAt(i)!=str.charAt(j))
				  return 0;
			  i++;
			  j--;
			  
		  }
		  return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int result = isPalindrome(str);
        System.out.println(result);        
    }
}
