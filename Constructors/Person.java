//Default Constructor
package Constructors;

public class Person {
	String firstName;
	  String lastName;
	  int age;

	public static void main(String args[]) {
	    Person person1= new Person();

	    person1.firstName = "Sanskruti";
	    person1.lastName = "Patke";
	    person1.age = 20;
	
	    System.out.println(person1.firstName);
	    System.out.println(person1.age);   
	}
}
