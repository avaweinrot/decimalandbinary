package binary;
import java.util.Scanner;

public class conversions {
		public static String convertNumber()
		{
			Scanner keyboard = new Scanner(System.in);
			String conversion = "";
			String correctConversion = "";
			System.out.println("What do you want to convert (if decimal to binary, type 1, if binary to decimal, type 2)");
			if (keyboard.next().equals("1"))
			{
				System.out.println("Enter a number:");
				long number1 = keyboard.nextLong();
				System.out.println("Finishted interpreting");
				long quotient = number1; 
				long remainder = 0; 
				while (quotient != 0)
				{
					remainder = (quotient%2);
					quotient = quotient/2;
					conversion += remainder; 
				}
				for (int k = conversion.length() - 1; k >= 0; k--)
				{
					correctConversion += conversion.charAt(k);
				}
			}
			else
			{
				System.out.println("Enter a number:");
				String num = keyboard.next();
//				long num2 = Long.parseLong(num); 
				long sum = 0; 
				double power = 0;
				for (int k = num.length() - 1; k >= 0; k--)
				{
					long num3 = Long.parseLong(num.substring(k, k+1)); 
					System.out.println(num3);
					sum += (num3*(Math.pow(2, power)));
					power++; 
				}
				correctConversion = "" + sum; 	
			}
			System.out.println(correctConversion);
			return correctConversion; 
			 
		}
		
		public static void main (String[] args)
		{
			convertNumber();
		}

}
