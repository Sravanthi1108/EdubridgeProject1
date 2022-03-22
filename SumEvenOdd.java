package conditonalconstructs;


public class SumEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int evensum=0, oddsum=0;
		int sum=0;
   
    for(int i=1;i<=1000;i++)
    {
    	if(i%2==0)
    	{
    	// evensum+=i;
    		sum+=i;
    	} 
    	//else
    	//{
    	//oddsum+=i;
    	//}
    	//System.out.println("evensum = " + evensum +"oddsum = "+ oddsum);
    		System.out.println("sum="+sum);
    }
	}
}
    

	//}
//}
