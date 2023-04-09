https://course.acciojob.com/idle?question=f8efb0ec-f224-43fc-9e87-56b0b7367888




import java.util.*;

class Solution {
    public static long maxAlternatingSum(int[] arr) {
        //Write your code here
		int n=arr.length;
		long dp[][]=new long[n][2];
		dp[0][0]=arr[0];
		for(int i=1;i<n;i++){
			dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+arr[i]);
			dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-arr[i]);
		}
		return Math.max(dp[n-1][0],dp[n-1][1]);
    }
    
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        System.out.println(Solution.maxAlternatingSum(input));
    }
}

