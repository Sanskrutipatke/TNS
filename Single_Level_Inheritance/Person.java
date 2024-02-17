package Single_Level_Inheritance;
//Single_Level Inheritance
public class Person {

		//data members
		private String name;
		private int id;
		private String address;
		private int age;
		private String bithPlace;
		private String Gender;
		
		//Default Constructor
		public Person() {
			System.out.println("Citizen object created");
		}


		//Parameterized Constructor

		public Person(String name, int id, String address, int age, String bithPlace, String gender) {
			
			this.name = name;
			this.id = id;
			this.address = address;
			this.age = age;
			this.bithPlace = bithPlace;
			Gender = gender;
		}

		//getter and setter

		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public String getBithPlace() {
			return bithPlace;
		}


		public void setBithPlace(String bithPlace) {
			this.bithPlace = bithPlace;
		}


		public String getGender() {
			return Gender;
		}


		public void setGender(String gender) {
			Gender = gender;
		}

	//toString
		@Override
		public String toString() {
			return "Person [name=" + name + ", id=" + id + ", address=" + address + ", age=" + age + ", bithPlace="
					+ bithPlace + ", Gender=" + Gender + "]";
		}
		
		
}

			