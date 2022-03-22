package conditonalconstructs;
import java.util.Scanner;
public class UpperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=scanner.next().charAt(0);
		if(ch>='A'&& ch<='Z')
		{
			System.out.println("character is uppercase");
		}
		else
		{
			System.out.println("character is lowercase");
		}
			
		

	}

}
