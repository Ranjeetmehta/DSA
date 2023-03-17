import java.util.Scanner;

class Solution{
    static int findLengthOfSmallestSubarray(int[] a, int K) {
        //Write your code here
		if(a==null || a.length==0) return 0;
		int min=Integer.MAX_VALUE;
		int len=a.length;
		for(int i=0;i<len;i++){
			int count=0;
			int sum=0;
			for(int j=i;j<len;j++){
				sum+=a[j];
				count++;
				if(sum>=K) min=Math.min(min,count);
			}
		}
		return (min==Integer.MAX_VALUE)?0:min;
    }
}
public class Main{ 
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
		int K = keyboard.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = keyboard.nextInt();
        }
        keyboard.close();
        System.out.println(Solution.findLengthOfSmallestSubarray(a, K));
    }
}
