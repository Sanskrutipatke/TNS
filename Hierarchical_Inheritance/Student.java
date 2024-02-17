package Hierarchical_Inheritance;

public class Student extends Person {
	//data members
	
		private int rollNo;
		private String branch;
		private String CollegeName;
		
	//default constructor 
		public Student() {
			super();
			System.out.println("Student Constructor");
		}
		
		//para constructor 
		public Student(String name, String City, int age,int rollNo, String branch, String collegeName) {
			super(name,City, age);
			this.rollNo = rollNo;
			this.branch = branch;
			this.CollegeName = collegeName;
		}
		public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		public String getBranch() {
			return branch;
		}
		public void setBranch(String branch) {
			this.branch = branch;
		}
		public String getCollegeName() {
			return CollegeName;
		}
		public void setCollegeName(String collegeName) {
			CollegeName = collegeName;
		}
		
		
		//to String
		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", branch=" + branch + ", CollegeName=" + CollegeName + ", getName()="
					+ getName() + ", getCity()=" + getCity() + ", getAge()=" + getAge() + "]";
		}
		
}
