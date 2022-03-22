package conditonalconstructs;
import java.util.Scanner;
public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the marks");
		int marks=scanner.nextInt();
		if(marks>=90 && marks<=100)
		{
			System.out.println("excellent");
			
		}
		else if(marks>=80 && marks<=90)
		{
			System.out.println("good");
		}
		else if(marks>=60 && marks<=80)
			{
			 System.out.println("just passed");
			
		    }
		else
		{
			System.out.println("failed");
		}
		

	}

}
