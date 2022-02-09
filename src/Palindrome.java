import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println("Enter the Palindrome value :\n");
		Scanner sc =new Scanner(System.in);
		int number = sc.nextInt();
		int temp   = number ;
		int finalvalue =0 ,reminder;
		while (number >0)
		{
        reminder = number % 10 ; 
			number   = number / 10 ;
			finalvalue	= finalvalue * 10 + reminder ;	

		}

		if (finalvalue==temp)
		{
			System.out.println("Palindrome \n "+ finalvalue);
		}
		else 
		{
			System.out.println("Not a Palindrome");
		}
		sc.close();
		
		/*int k=sc.nextInt();
		System.out.println(k);*/
	}
}

