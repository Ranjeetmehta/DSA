import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;


class Main {
    
  public static void main (String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        Solution obj=new Solution();
        obj.solve(k);
        System.out.println();
    }
  
}

class Solution{
    public static void solve(int k)
    {
        // your code here
		int temp=1;
		System.out.print(temp+" ");
		for(int i=1;i<=k;i++){
			temp=(temp*(k-i+1))/i;
			System.out.print(temp+" ");
		}
        
    }
}
