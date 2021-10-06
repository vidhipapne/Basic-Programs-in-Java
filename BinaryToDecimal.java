package prepinsta100codes;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		//binarytodecimal
		Scanner s = new Scanner(System.in);
		int binary = s.nextInt();
		int decimal = 0;
		int n=0;
		while(binary>0) {
			int temp = binary%10;
			decimal = (int) (decimal + temp*Math.pow(2, n));
			binary = binary/10;
			n++;	
		}   
		System.out.println(decimal);
		
	
	//decimal to octal
		int octals=0;
		while(decimal > 0)
		{
			int r = decimal % 8;
			octals = octals*10+ r;
			decimal = decimal / 8;
		}
		//System.out.println("Octal number : "+octals);




		//decimal to binary 
	
		int bin[] = new int[20];
		int i = 0; 
		//writing logic for the conversion 
		while(decimal > 0)
		{       
			int r = decimal % 2;
			bin[i++] = r;
			decimal = decimal/2;
		}
		//printing result
		System.out.print("Binary number : ");
		for(int j = i-1 ; j >= 0 ; j--)
		System.out.print(bin[j]+" ");
	
  

//binary to octal
		System.out.print("Enter for octal");
		int octal = 0;
		int m=0;
		int binarys=s.nextInt();
		while(binarys >0) {
			int temps = binarys%10;
			octal = (int) (octal+ temps*Math.pow(8,m));
			binarys= binarys/10;
			m++;
		}
		System.out.print(octal);
		s.close();
	}
}
