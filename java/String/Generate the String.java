https://course.acciojob.com/idle?question=c984f8f6-d6ea-4544-b0b7-f2ca078d5915


import java.util.*;

class Solution {
    public static String mergeStrings(String a, String b) {
        //Write your code here
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<a.length() || i<b.length();i++){
			if(i<a.length())
				sb.append(a.charAt(i));
			if(i<b.length())
				sb.append(b.charAt(i));
		}
		return sb.toString();
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String result = Solution.mergeStrings(a, b);
        System.out.println(result);
    }
}
