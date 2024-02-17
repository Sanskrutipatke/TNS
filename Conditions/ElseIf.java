//program to check multiple conditions using : if-elseif

package Conditions;
public class ElseIf {
	public static void main(String args[])
	{
		int marks = 40;
		
		if(marks>=91 && marks<=100)
		{
			System.out.println("Grade A - Very Good");
		}
		else if(marks >=71 && marks<=90)
		{
			System.out.println("Grade B - Good");
		}
		else if(marks >=40 && marks<=70)
		{
			System.out.println("Grade C - work harder");
		}
		else if(marks >=0 && marks<=39)
		{
			System.out.println("Fail - padh le");
		}
		else
		{
			System.out.println("Enter Valid Marks");
		}
	}

}
