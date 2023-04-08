https://course.acciojob.com/idle?question=a3385437-1cab-4ba9-9da3-2a5fe2231e19









import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        String ans = Solution.removeConsecutiveDuplicates(str);
        System.out.println(ans);
    }
}

class Solution {

    static String removeConsecutiveDuplicates(String s) {
		String res="";
		int n=s.length();
		for(int i=0;i<n;i++){
			if(i<n-1 && s.charAt(i)==s.charAt(i+1))
				continue;
			else{
				res=res+s.charAt(i);
			}
		}
		return res;
    }
}
