package Hierarchical_Inheritance;

public class Driver {
public static void main(String[] args) {
		
		Person p=new Person();
		
		System.out.println("Person class details............");
		System.out.println(p);
		
//		Student s=new Student();
//		
//		Employee emp=new Employee();
		
		//dynamic binding//runtime polymorphism //loose coupling 
		
		Person p1;      //object reference
		p1=new Person("Aniket","Pune",20);
		if(p1 instanceof Person)
		{
		System.out.println(p1);
		}
		
		
		p1=new Student("Sanskruti Patke","Ahmednagar",22,102,"AI", "GHRCEM");
		if(p1 instanceof Student)
		{
		System.out.println(p1);
		}
		
		
		p1=new Employee("Aniket","Baramati", 23,1234,"Microsoft", "Developer", 500000);
		if(p1 instanceof Employee)
		{System.out.println(p1);				
		}
		
		
		
		
		
		
		
}		
}
