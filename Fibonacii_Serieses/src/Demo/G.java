package Demo;

import java.util.Scanner;

public class G {

	public static void main(String[] args) {
		
		int input;
		int a = 0;
		int b = 1;
		int c;
		
		System.out.print("Enter Range : ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		
		for(int i=1; i <= input; i++) {
			
			System.out.println(a);
			
			c = a + b;
			a = b;
			b = c;
		}
	}
}
