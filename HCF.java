package conditonalconstructs;
import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,hcf=0;
		System.out.println("enter first number: ");
		int a=sc.nextInt();
		System.out.println("enter second number: ");
		int b=sc.nextInt();
		for(i=1;i<=a||i<=b;i++)
		{
		if(a%i==0 && b%i==0)
			hcf=i;
	}
	
	System.out.println("hcf of given numbers is: "+hcf);
	}
	    
	

	

}
