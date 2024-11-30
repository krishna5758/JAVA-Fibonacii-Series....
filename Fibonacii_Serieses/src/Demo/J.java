package Demo;

import java.util.Scanner;

public class J {

	public static void main(String[] args) {
		
		int input;
		int a=0;
		int b=1;
		int c;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range: ");
		 input = sc.nextInt();
		 
		 for(int i=0; i<=input; i++) {
			 
			 System.out.println(a);
			 
			 c= a+b;
			 a=b;
			 b=c;
		 }
	}
}
