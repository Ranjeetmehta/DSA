https://course.acciojob.com/idle?question=0bfe93c6-5411-4ac5-99db-34a0a21c940a


import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
   
    public static String reverseWords(String s)
    {
        // your code here
		String result="";
	s=s.trim();
		for(String t:s.split(" ")){
			result=t+" "+result;
			result=result.trim();
		}
		return result;
    } 
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String p = sc.nextLine();
        while (t > 0) {
            String s = sc.nextLine();
            System.out.println(reverseWords(s));
            t--;
        }
    }
}
