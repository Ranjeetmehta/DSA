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
        //Write code here
		ArrayList<String> str=new ArrayList<>(n+1);
		str.add("1");
		for(int i=2;i<=n;i++){
			String prev=str.get(i-1-1);
			String curr="";
			for(int j=0;j<prev.length();j++){
				 int count = 1;
        while (j + 1 < prev.length() && prev.charAt(j) == prev.charAt(j + 1)) {
          count++;
          j++;
        }
        curr += Integer.toString(count) + prev.charAt(j);
      }
    str.add(curr);
    }
    return str.get(n - 1);
	}
			
		
    }   

