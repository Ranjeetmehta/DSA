https://course.acciojob.com/idle?question=95a415cf-c6d0-4737-90c6-ef7a0ef64021




import java.util.*;
import java.io.*;

public class Main {
	static String compressedString(String s) {
        //Write your code here
		int len=s.length();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<len;i++){
			int count=1;
			while(i<len-1 && s.charAt(i)==s.charAt(i+1)){
				count++;
				i++;
			}
			sb.append(s.charAt(i));
			if(count>1) sb.append(count);
		}
		return new String(sb);
     }
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-- > 0){
            String s = br.readLine();
           
            System.out.println( compressedString(s));
        }
    }
}
