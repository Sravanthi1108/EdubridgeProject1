package conditonalconstructs;
import java.util.Scanner;

public class Multiples12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter any number");
		int number=scanner.nextInt();
		
		
			//check if number is multiples of 12
		for(int i=1;i<=100;i++)
			if(i%12==0) 
			{
				System.out.println(i);
			}
			//else
			{
				//System.out.println("number is not multiple of 12 ");
			}
				
		}

	}


