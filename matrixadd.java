import java.util.*;
class matrixadd
{
 public static void main(String args[])
 {
	int a[][]=new int[10][10];
    int b[][]=new int[10][10];
    int c[][]=new int[20][20];
	int i,j,row1,row2,col1,col2;
	
	Scanner obj=new Scanner(System.in);
	
	System.out.println("Enter the row of 1st matrix");
	row1=obj.nextInt();
	System.out.println("Enter the column of 1st matrix");
	col1=obj.nextInt();
	System.out.println("Enter the elements of 1st matrix");
		for(i=0;i<row1;i++)
		{
			for (j=0;j<col1;j++)
			{
				a[i][j]=obj.nextInt();
			}
		}
	System.out.println("Enter the row of 2nd matrix");
	row2=obj.nextInt();
	
	System.out.println("Enter the column of 2nd matrix");
	col2=obj.nextInt();
	
	System.out.println("Enter the elements of 2nd matrix");
		for(i=0;i<row2;i++){
			for (j=0;j<col2;j++){
				b[i][j]=obj.nextInt();
			}
		}
		for(i=0;i<row2;i++){
			for (j=0;j<col2;j++){
				c[i][j]=a[i][j]+b[i][j];
			}
		}
	System.out.println("Sum of matrix is: ");
	System.out.println();
		for(i=0;i<row2;i++){
			for (j=0;j<col2;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
