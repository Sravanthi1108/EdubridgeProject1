package test;

public class TwoDimensionalArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{3,4,5},{5,6,7}};//creating matrices
		int b[][]= {{4,3,2},{1,2,4},{2,0,1}};
		int c[][]=new int[3][3];//3 rows,3 columns
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
               c[i][j]=a[i][j]+b[i][j];//addition of matrices
               System.out.print(c[i][j]+" ");
	}
			System.out.println();

}
	}
}
