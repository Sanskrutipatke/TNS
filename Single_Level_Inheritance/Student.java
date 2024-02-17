package Single_Level_Inheritance;

public class Student extends Person{
		private int rollno;
		private String collegeName;
		private String branch;
		
		
		//Parameterized Constructor
		public Student(int rollno, String collegeName, String branch, String name, int id, String address, int age, String bithPlace, String gender) {
			super( name,  id,  address,  age,  bithPlace,  gender);
			this.rollno = rollno;
			this.collegeName = collegeName;
			this.branch = branch;
		}


		//default constructor 
		public Student() {
			System.out.println("Student object is created");
		}


		public int getRollno() {
			return rollno;
		}


		public void setRollno(int rollno) {
			this.rollno = rollno;
		}


		public String getCollegeName() {
			return collegeName;
		}


		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}


		public String getBranch() {
			return branch;
		}


		public void setBranch(String branch) {
			this.branch = branch;
		}


		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", branch=" + branch + ", getName()="
					+ getName() + ", getId()=" + getId() + ", getAddress()=" + getAddress() + ", getAge()=" + getAge()
					+ ", getBithPlace()=" + getBithPlace() + ", getGender()=" + getGender() + "]";
		}
	}

