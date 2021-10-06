package prepinsta100codes;

public class armstrong {

	public static void main(String[] args) {
	
		int m = 153;
		
		int n = m,arm=0;
		while(n!=0) {
			int r = n%10;
		    arm = arm + (r*r*r);
			n=n/10;
		}
			if(arm==m)
				System.out.println("Number is armstrong.");
			else
				System.out.println("Number is not armstrong");
		}
          
	}

