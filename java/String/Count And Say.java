https://course.acciojob.com/idle?question=03e970b5-d00e-4fa6-b747-8ee732707e78

import java.io.*;
import java.util.*; 

class Main{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(read.readLine());
        
        Solution ob = new Solution();
        
        System.out.println(ob.countandsay(n));
    } 
} 
class Solution
{
    public String countandsay(int n) {
        if(n==1) return "1";
		if(n==2) return "11";
		String str="11";
		for(int i=3;i<=n;i++){
			str+='$';
			int count=1;
			String temp=" ";
			char []arr=str.toCharArray();
			for(int j=1;j<str.length();j++){
				if(arr[j]!=arr[j-1]){
					temp+=count+0;
					temp+=arr[j-1];
					count=1;
				}
				else count++;
			}
			str=temp;
		}
		return str;
		
    }   
}
