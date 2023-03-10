import java.util.*;
class Solution {

public static String changePi(String str) {
    // Your code here
	if(str.length() <=1){
		return str;
	}
	if(str.charAt(0)=='p' && str.length()>=2 &&str.charAt(1)=='i'){
		return "3.14" + changePi(str.substring(2,str.length()));
		
	}
	return str.charAt(0) + changePi(str.substring(1,str.length()));
}
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(Solution.changePi(str));
    }
}
