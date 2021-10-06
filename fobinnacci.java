package prepinsta100codes;

import java.util.Scanner;

public class fobinnacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a =-1 , b =1, c=0;
		while(n!=0) {
			c=a+b;
			a=b;
			b=c;
			n--;
			System.out.print(c + " ");
		}
		s.close();
	}

}
