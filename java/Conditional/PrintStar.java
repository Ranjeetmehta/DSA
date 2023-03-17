import java.util.*;

class Accio{
    static void PrintStar(int N){
        //write code and print here
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Accio obj = new Accio();
        obj.PrintStar(N);
    }
}
