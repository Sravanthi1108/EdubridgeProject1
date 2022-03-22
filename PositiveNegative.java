package conditonalconstructs;
import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number to test it");
		int number=scanner.nextInt();
		if(number>0)
		{
			System.out.println("number is positive");
		}
		else
			System.out.println("number is negative");

	}

}
