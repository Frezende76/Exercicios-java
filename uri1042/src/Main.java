import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if (A < B) {
		   if (B < C){
			System.out.println(A);
			System.out.println(B);
			System.out.println(C);
		   }else if (A < C){
			System.out.println(A);
			System.out.println(C);
			System.out.println(B);	
		   }else {
			System.out.println(C);
			System.out.println(A);
			System.out.println(B);	
		   }
		} 
		   else if(B < C) {
			   if(A < C) {
				System.out.println(B);
				System.out.println(A);
				System.out.println(C);	
			   }else {
				System.out.println(B);
				System.out.println(C);
				System.out.println(A);	
			   }
		   }else {
			   System.out.println(C);
			   System.out.println(B);
			   System.out.println(A);	
		   }
		
		
		sc.close();
		
		System.out.println();
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
	}
}
