package Day16_ExceptionHandling;
import java.util.Scanner;

public class Example{
static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter student id: ");
		int id=sc.nextInt();
		
		if(id>100)
		{
			System.out.println("Student found");
		}
		else
		{
			try
			{
				throw new StudentNotFoundException(id);
			}
			
			catch(StudentNotFoundException se)
			{
				System.out.println(se);	
				System.out.println(se.getMessage());
			}
		}

	}

}