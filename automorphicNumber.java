package prepinsta100codes;

public class automorphicNumber {
         public static void main(String args[]) {
        	 Scanner sc = new Scanner(System.in);
     		//input from user
     		System.out.print("Enter a number : ");				
     		int number = sc.nextInt();
                     //Convert the number to string
     		String s1 = Integer.toString(number);
                     //Calculate the length
     		int l1 = s1.length();
     		int sq = number * number;
     		String s2 = Integer.toString(sq);
     		int l2 = s2.length();
                     //Create Substring
     		String s3 = s2.substring(l2-l1);
     		if(s1.equals(s3))
     			System.out.println("Automorphic Number");
     		else
     			System.out.println("Not an Automorphic Number");
     		//closing scanner class(not compulsory, but good practice)
     		sc.close();	
        	 
         }
}
