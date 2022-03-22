package conditonalconstructs;
import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		char coption;
		do
		{
		System.out.println("1:monday");
		System.out.println("2:tuesday");
		System.out.println("3:wednesday and thursday");
		System.out.println("4:friday");
		System.out.println("5:saturday and sunday");
		System.out.println("enter the option");
		String option=scanner.next();
		switch(option)
		{
		case "Monday":
			System.out.println("first day of the week");
			break;
		case "Tuesday":
			System.out.println("second day of the week");
			break;
		case "Wednesday":
		case "Thursday":	
			System.out.println("midday of the week");
			break;
		case "Friday":
			System.out.println("last working day of the week");
			break;
		case "Saturday":
		case "Sunday":	
				
			System.out.println("weekend");
		default:System.out.println("enter the valid option");
		}
		System.out.println("do you want to continue then press Y if not press N");
		coption=scanner.next().charAt(0);
		}
		while(coption=='Y'||coption=='y');
	}
	}

	


