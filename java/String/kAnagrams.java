https://course.acciojob.com/idle?question=05c4e411-0657-447f-8f0b-2ba24f62969f


import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        String s1 = input.next(), s2 = input.next();
        if(s1.length() != s2.length()){
            System.out.println(0);
            return;
        }
        int n = s1.length();
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        for(int i = 0; i < n; i++){
            f1[s1.charAt(i) - 'a']++;
            f2[s2.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(f1[i] > f2[i]){
                k -= (f1[i] - f2[i]);
            }
        }
        System.out.println(k >= 0 ? 1 : 0);
    }
}
