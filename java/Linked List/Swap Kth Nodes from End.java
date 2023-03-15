import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
}

class Solution{
	Node swapkthnode(Node head, int num, int k)
    {
        //Write your code here
		if(head==null) {
			return head;
		}
			if(k>num){
			return head;
		}
		Node x=head;
		Node prevX=null;
		Node y=head;
		Node prevY=null;
		for(int i=1;i<k;i++){
			prevX=x;
			x=x.next;
		}
		for(int i=1;i<num-k+1;i++){
			prevY=y;
			y=y.next;
		}
		if(prevX !=null){
			prevX.next=y;
		}
		if(prevY!=null){
			prevY.next=x;
		}
		Node temp=x.next;
		x.next=y.next;
		y.next=temp;

		if(k==1){
			return y;
		}
		if(k==num){
			return x;
		}
		return head;
	
	}
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        LinkedList list = new LinkedList();
        for(int i = 0; i < n; i++){
            int x = input.nextInt();
            list.add(x);
        }
        Solution obj = new Solution();
		list.head = obj.swapkthnode(list.head, n, k);
		Node curr = list.head;
		while(curr != null){
			System.out.print(curr.data + " ");
			curr = curr.next;
	    }
	}
}
