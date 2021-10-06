import java.util.Scanner;
public class reverse_Number
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int number = in.nextInt();
        int reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}