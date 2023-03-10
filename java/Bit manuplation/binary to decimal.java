import java.util.*;

class Accio{
    static int ASLoops6(String s){
        // write code here
		int num=0;
		for(int i=0;i<s.length();i++){
			num=num*2+(s.charAt(i)-'0');
		}
		return num;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Accio obj = new Accio();
        int ans=obj.ASLoops6(s);
        System.out.println(ans);
    }
}
