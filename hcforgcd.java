package prepinsta100codes;

import java.util.Scanner;

public class hcforgcd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n ;
		if( n1 != n2)
		{
				n = n1 % n2;	
				if(n != 0)
				{
					n1 = n2;
					n2 = n;	
					System.out.println(n2);				
		     	}
				
		}	
		else
			System.out.println(n2);		
		
		s.close();	
	}
}	
	
