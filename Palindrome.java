package conditonalconstructs;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println("enter any number: ");
      int r,sum=0,temp;
      temp=n;
     // System.out.println("enter any number: ");
      while(n>0)
      {
    	  r=n%10;
    	  sum=(sum*10)+r;
    	  n=n/10;
      }
      if(temp==sum)
      {
    	  System.out.println("palindrome");
      }
      
      else
    	  System.out.println("not palindrome");
       
	}

}
