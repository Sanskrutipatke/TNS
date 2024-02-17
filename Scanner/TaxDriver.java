package Scanner;
import java.util.Scanner;
public class TaxDriver {
	public static void main(String[] args) {

		//scanner object to accept user input
	
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Enter the Name ");
		String name1=sn.next();
		
		System.out.println("Enter the Gender ");
		String gender1=sn.next();
		
		System.out.println("Enter the Age ");
		int age1=sn.nextInt();
		
		System.out.println("Enter the Income ");
		int income1=sn.nextInt();
			
		Person person1=new Person();
		person1.setName(name1);
		person1.setGender(gender1);
		person1.setAge(age1);
		person1.setIncome(income1);
		
		TaxCalculation tc=new TaxCalculation();
		tc.calculateTax(person1);
		
		System.out.println(person1);
		
	}
}
