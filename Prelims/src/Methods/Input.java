package Methods;
import java.util.*;
public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in);){
		/*
		 * System.out.println("Enter first number-"); int a = sc.nextInt();
		 * System.out.println("Enter second number-"); int b = sc.nextInt();
		 * System.out.println("Enter third number-"); int c = sc.nextInt(); int d =
		 * a*b*c; System.out.println("Total= "+d);
		 */
		int mul=1;
		System.out.println("Enter the first number in front of which you want to multiplication of 10 numbers");
		int a=sc.nextInt();
		for(int i=1;i<=5;i++)
		{
			mul = mul*i;
		}
		System.out.println("Multiplication is = "+mul);}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Mandatory");
		}
	}
}