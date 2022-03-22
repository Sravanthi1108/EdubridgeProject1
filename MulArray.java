package test;

public class MulArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2},{3,4}};//creating matrices
		int b[][]= {{4,3},{1,2}};
		int c[][]=new int[3][3];//3 rows,3 columns
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)//printing multiplication
			{
				c[i][j]=0;
				for(int k=0;k<2;k++)
				{
               c[i][j]+=a[i][k]*b[k][j];//addition of matrices
				}
               System.out.print(c[i][j]+" ");
	}
			System.out.println();


	}


	}}
