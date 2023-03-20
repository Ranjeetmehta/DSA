import java.util.*;

class Solution {
    public boolean find132pattern(int[] nums) {
        //Write code here
		int n=nums.length;
		int[] min =new int[n];
		min[0]=nums[0];
		
		for(int i=1;i<n;i++){
		min[i]=Math.min(min[i-1],nums[i]);
			Stack<Integer> st=new Stack();
			for(int j=n-1;j>=0;j--){
				if(nums[j]>min[j]){
					while(!st.isEmpty() && st.peek()<min[j])
						st.pop();
					if(!st.isEmpty() && st.peek()<nums[j])
						return true;
					st.push(nums[j]);
				}
			}
			return false;
		}
		return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        boolean result = Obj.find132pattern(arr);
        if (result)
            System.out.println("true");
        else
            System.out.println("false");
        sc.close();
    }
}
