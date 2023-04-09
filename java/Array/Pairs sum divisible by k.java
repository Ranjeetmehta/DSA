https://course.acciojob.com/idle?question=24edc1b6-dd72-4525-86a9-f462b6eb0cd1



import java.io.*;
import java.util.*;

class Solution {
    public long Pairs(int []arr,int k){
        //your code here
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if((arr[i]+arr[j])%k==0) count++;
			}
			
			
		}
 return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;++i){
                arr[i]=sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.Pairs(arr,k)); 
    }
}
