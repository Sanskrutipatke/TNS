package Hierarchical_Inheritance;

public class Person {
	//Data Members
		private String name;
		private String City;
		private int age;
		
		
		
		
		//Default Constructor
		public Person() {
			System.out.println("Person class object is created");
			name="Sanskruti";
			City="Pune";
			age=20;
			
		}
		
		
		//Para Constructor
		public Person(String name, String city, int age) {
			
			this.name = name;
			this.City = city;
			this.age = age;
		}
		//Getter And Setter

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return City;
		}
		public void setCity(String city) {
			City = city;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", City=" + City + ", age=" + age + "]";
		}
}
