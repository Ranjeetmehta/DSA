import java.util.*;

class Solution {

    public int[] singleNumber3(int n, int[] nums) {
        // write code here
		int res=0;
		for(int num:nums){
			res ^= num;
		}
		int k=0;
		while((res & 1<<k)==0) k++;
		int xorOfPeopleHavingSet=0;
		int xorOfPeopleHavingUnset=0;
		for(int num:nums){
			if((num & 1<<k) > 0){
				xorOfPeopleHavingSet ^=num;
			}
			else{
				xorOfPeopleHavingUnset ^=num;
			}
		}
		int[] ans={xorOfPeopleHavingSet,xorOfPeopleHavingUnset};
		Arrays.sort(ans);
		return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Solution Obj = new Solution();
        scn.close();
        int[] ans = Obj.singleNumber3(n, arr);
        System.out.print(ans[0] + " " + ans[1]);
    }
}
