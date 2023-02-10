import java.util.*;

class Solution {
    public int MaxSum(int[] arr, int n) {
        // Write your code here

		int maxSum=-100000;
		int curMax=maxSum;
		int minSum=100000;
		int curMin=minSum;
		int wholeArraySum=0;
		for(int i=0;i<n;i++){
			wholeArraySum+=arr[i];
			//for max sum subarry part
			int maxStart=arr[i];
			int maxJoinPrev=arr[i]+curMax;
			curMax=Math.max(maxStart,maxJoinPrev);
			maxSum=Math.max(maxSum,curMax);
			
			// min sum sub array part
			int minStart=arr[i];
			int minJoinPrev=arr[i]+curMin;
			curMin=Math.min(minStart,minJoinPrev);
			minSum=Math.min(minSum,curMin);
		}
		//if all number are negative
		if(wholeArraySum==minSum) return maxSum;
		return Math.max(maxSum,wholeArraySum-minSum);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
	    Solution Obj = new Solution();
        int ans = Obj.MaxSum(arr, n);
        System.out.println(ans);
    }
}
