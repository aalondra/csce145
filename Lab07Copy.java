//Alondra Arredondo
package Lab07;
import java.util.Scanner;


public class Lab07Copy {

		public static void main(String[] args) {
			//creating scanner object
			Scanner key = new Scanner(System.in);
			
			//asking for rows(matrix 1)
			System.out.println("Enter the number of rows in matrix1");
			int mat1_rows= key.nextInt();
			
			//columns of matrix 1
			System.out.println("Enter the number of columns in matrix1");
			int mat1_cols = key.nextInt();
			
			//rows of matrix 2
			System.out.println("Enter the number of rows in matrix2");
			int mat2_rows = key.nextInt();
			
			//columns of matrix 2
			System.out.println("Enter the number of columns in matrix2");
			int mat2_cols = key.nextInt();
			
			//checking if dimensions are the same
			while (mat1_rows!= mat2_rows || mat1_cols != mat2_cols)
			{
				//rows
				System.out.println("Dimension mismatch! Try again.");
				System.out.println("Enter the number of rows in matrix1");
				 mat1_rows= key.nextInt();
				
				//columns of matrix 1
				System.out.println("Enter the number of columns in matrix1");
				 mat1_cols = key.nextInt();
				
				//rows of matrix 2
				System.out.println("Enter the number of rows in matrix2");
				 mat2_rows = key.nextInt();
				
				//columns of matrix 2
				System.out.println("Enter the number of columns in matrix2");
				 mat2_cols = key.nextInt();
			}
			
			//creating matrices
				int[] [] matrix1 = new int [mat1_rows][mat1_cols];
				int[] [] matrix2 = new int [mat2_rows][mat2_cols];

				//first matrix(asking for inputs)
				for(int i = 0; i < mat1_rows; i++)
				{
					for(int j= 0; j < mat1_cols; j++)
					{
						System.out.println("Enter the value of the matrix1 at position("+ i +","+ j +"):");
						matrix1[i][j] = key.nextInt();
						
					}
				}
				
				//second matrix(asking for inputs)
				for(int i = 0; i < mat2_rows ; i++)
				{
					for(int j = 0; j < mat2_cols; j++)
					{
						System.out.println("Enter the value of the matrix2 at position("+ i +","+ j +"):");
						matrix2[i][j] = key.nextInt();
					}
				}
				
				//adding the matrices			
				int[][] matrixSum = new int[mat1_rows][mat2_cols];
				int sum = 0;
				for(int i = 0; i < mat1_rows; i++)
				{
					for(int j = 0; j < mat2_cols; j++)
					{
						sum = matrix1[i][j] + matrix2 [i][j];
						matrixSum[i][j]= sum;
						sum = 0; 
					}
				}
			
				//printing matrix
				for (int i = 0; i < mat1_rows; i++)
				{
					for (int j = 0; j < mat2_cols; j++)
					{
						System.out.print(matrixSum[i][j]+" ");
					}
					System.out.println();	
				}


	}


}
