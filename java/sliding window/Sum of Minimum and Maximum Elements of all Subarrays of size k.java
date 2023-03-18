import java.util.*;
class Solution{
    public static long sumOfMaxAndMin(int arr[], int n, int k)
    {
        //Write your code here 
		Deque<Integer> maxdq=new LinkedList<>();
		Deque<Integer> mindq=new LinkedList<>();
		long ans=0;
		int i=0;
		for(;i<k;i++){
			while(!maxdq.isEmpty() && arr[i]>=arr[maxdq.peekLast()])
				maxdq.removeLast();
				maxdq.addLast(i);
			while(!mindq.isEmpty() && arr[i]<=arr[mindq.peekLast()])
				mindq.removeLast();
			mindq.addLast(i);
		}
		ans+=arr[maxdq.peek()];
		ans+=arr[mindq.peek()];
		for(;i<n;i++){
			while(!maxdq.isEmpty() && maxdq.peek()<=i-k)
				maxdq.removeFirst();
			while(!maxdq.isEmpty() && arr[i]>=arr[maxdq.peekLast()])
				maxdq.removeLast();
			maxdq.addLast(i);
			while(!mindq.isEmpty() && mindq.peek()<=i-k)
				mindq.removeFirst();
			while(!mindq.isEmpty() && arr[i]<=arr[mindq.peekLast()])
				mindq.removeLast();
			mindq.addLast(i);
			ans+=arr[mindq.peek()];
			ans+=arr[maxdq.peek()];
		}
		return ans;
    }
}









public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n] ; 
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
         System.out.print(Solution.sumOfMaxAndMin(arr, n , k ));
        
    }
}
