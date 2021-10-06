package prepinsta100codes;

public class FriendlyPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//input from user
		System.out.print("Enter First number : ");				
		int number1 = sc.nextInt();
		System.out.print("Enter Second number : ");				
		int number2 = sc.nextInt();
		//declare two variables to store the addition of factors of both numbers which are entered by user 
		int add1 = 0, add2 = 0;
		//logic for finding factors and calculating sum of all those factors for number1
		for(int i = 1 ; i < number1 ; i++)
		{
			if(number1 % i == 0)
				add1 = add1 + i;
		}
		//logic for finding factors and calculating sum of all those factors for number2
		for(int i = 1 ; i < number2 ; i++)
		{
			if(number2 % i == 0)
				add2 = add2 + i;
		}
		//condition for friendly pair number
		if(number1 == add2 && number2 == add1)
			System.out.println("Number is Friendly Pair");
		else
			System.out.println("Number is not Friendly Pair");
		//closing scanner class(not compulsory, but good practice)
		sc.close();	
	}

}
