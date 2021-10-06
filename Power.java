package prepinsta100codes;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the base number");
		int a = s.nextInt();
		System.out.println("Enter the power number");
		int b = s.nextInt();
		int result=1;	
		while(b!=0) {
		   result = result*a;
		   b--;
		}
		System.out.println(result);
		s.close();
	}
}
