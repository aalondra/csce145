import java.util.Scanner;
public class GradeAverage {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		String input = "";
		
		//whatever comes after, repeat at least once
		do
		{
			int gradeCounter = 0;
			double sum = 0, avg = 0; 
			
			System.out.println("Enter the grades whose average you want to calculate. Enter a negative number once done: ");
			
			double grade = key.nextDouble();
			
			//nesting loops
			while (grade >= 0 && grade <= 100)
			{
				sum = sum += grade;
				
				//adding 1 to grade counter, increment operator
				gradeCounter++;
				
				grade = key.nextDouble();
				
			}
			
			if(gradeCounter > 0)
			{
				avg= sum/gradeCounter;
				
				//no trailing numbers
				System.out.printf("%.2f\n", avg);
				
			}
			System.out.println("Average = "+ avg);
			
			System.out.println("Do you want to enter the average for another set of grades? \"Yes\" or \"No\" ");
			
			input= key.next();
			
			
			
		}while(input.equalsIgnoreCase("Yes"));
		
		System.out.println("Exiting the program!");
		
		
		
		
		
	}

}
