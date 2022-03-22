package conditonalconstructs;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i,c=0;
		System.out.println("enter any number: ");
		 n=sc.nextInt();
		 for(i=0;i<=n;i++)
		 {
			 if(n%i==0)
			 {
				 c++;
			 }
		 }
				
		 if(c==2)

		 {
		 System.out.println("prime number");

	}
			 else
			 {
				 System.out.println("not a prime number");

}
	}
	
}