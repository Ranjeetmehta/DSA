import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
    public static int singleNumber(int[] nums) {
    // Your code here
		int[] bits=new int[32];
		for(int n:nums){
			int i=0;
			while(i<32){
				if((n & 1)==1){
					bits[i]++;
				}
				i++;
				n>>=1;
			}
		}
		int ans=0;
		int pow=1;
		for(int i=0;i<32;i++){
			if(bits[i]%3==1) ans+=pow;
			pow*=2;
		}
		return ans;
}
}
public class Main {
  public static void main (String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(Solution.singleNumber(nums));
	}
}
