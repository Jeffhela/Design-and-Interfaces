import java.util.Scanner;

public class Comparisons 
{

	public static void main(String[] args) 
	{
		// compare three strings
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter first name: ");
		String str1 = scan.nextLine();
		
		System.out.print("Enter second name: ");
		String str2 = scan.nextLine();
		
		System.out.print("Enter third name: ");
		String str3 = scan.nextLine();
		
		// show the largest
		System.out.println( "\nLargest:  " + Compare3.largest (str1,str2,str3));
		
		//compare three integers
		System.out.print("\nEnter first int: ");
		int int1 = scan.nextInt();
		
		System.out.print("Enter second int: ");
		int int2 = scan.nextInt();
		
		System.out.print("Enter third int: ");
		int int3 = scan.nextInt();
		
		// show the largest
		System.out.println( "\nLargest:  " + Compare3.largest (int1,int2,int3)); // autoboxing - int boxed into integer
		
		scan.close();

	}

}
