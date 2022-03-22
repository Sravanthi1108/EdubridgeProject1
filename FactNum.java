package conditonalconstructs;
import java.util.Scanner;

public class FactNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("enter any number: ");
         int number=sc.nextInt();
         int fact=1;
    //   System.out.println("enter any number: ");
       for(int i=1;i<=number;i++)
       {
    	   
    	   fact=fact*i;
       }
       System.out.println("factorial of"+number+"is:"+fact);
         
	}

}
