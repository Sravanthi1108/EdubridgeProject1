package conditonalconstructs;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the year");
		int year=scanner.nextInt();
		if(year%4==0)
		{
			System.out.println("it is leap year");
		}
		else
		{
			System.out.println("it is not a leap year");
		}
			
		

	}

}
