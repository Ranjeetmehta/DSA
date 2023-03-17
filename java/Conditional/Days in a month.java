import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
       Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		int year=sc.nextInt();
		if(month%2!=0 || month==8){
			System.out.println("31");
			
		}
		 else if(month==4 ||month==6 ||month==9 || month==11){
			System.out.println("30");
		}
		if(month==2 && ((year%4==0 )&&(year%400==0 || year%100!=0))){
			System.out.println("29");
		}
		else if(month==2){
			System.out.println("28");
		}
	}
    }
