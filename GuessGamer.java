//Write a guessing game where the user has to guess a secret number. 
//After every guess the program tells the user whether their number was too 
//large or too small. At the end the number of tries needed should be printed. 
//It counts only as one try if they input the same number multiple times 
//consecutively.
import java. util.Random;
import java.util.*;
public class Hell
{
	public static void main(String args[])
	{
		Random r=new Random();
		int a,r1=r.nextInt(100),counts=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Guess a Number");
		a=sc.nextInt();
		for( ;a!=r1; )
		{
			if(a>r1)
				{
					System.out.println("Please Guess Lesser number");
				}
			else
				{
					System.out.println("Please Guess Larger number");
				}
			System.out.println("Guess a Number");
			a=sc.nextInt();
			counts++;
		}
		
		System.out.println("Congrates You Guesssed it Right "+a);
		System.out.println("The Random Number was " +r1);
		System.out.println("The total Tries " +counts);
	}
}	