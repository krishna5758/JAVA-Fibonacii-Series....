package Demo;

import java.util.Scanner;

   // 1. main method
  // 2. declare variables.
 // 3. add scanner & give "Enter Input".
// 4.for loop 

 class A{

	 public static void main(String[] args) {
			
			
		
		
		int term;
		int a = 0;
		int b = 1;
		int c ;
		
		
		
		System.out.println("Enter Input");
		Scanner sc = new Scanner(System.in);
		 term = sc.nextInt();
		 
		 for(int i=1; i<= term; i++) {
			 
			 System.out.println(a);
			 
			 c = a+b;
			 a = b;
			 b = c;
		 }
	
		
		
		
 }
 }
         

