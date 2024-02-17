package Encapsulation;

public class Encapsulation001 {

	private int rollNo;
	private String name;
	private String std;
	private int fees;
	private int pMobile;
	private double cgpa;
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getpMobile() {
		return pMobile;
	}
	public void setpMobile(int pMobile) {
		this.pMobile = pMobile;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Encapsulation001 [rollNo=" + rollNo + ", name=" + name + ", std=" + std + ", fees=" + fees
				+ ", pMobile=" + pMobile + ", cgpa=" + cgpa + "]";
	}

	
	public static void main(String[] args) {

		Encapsulation001 en=new Encapsulation001();
		
		en.setName("Sanskruti");
		en.setCgpa(7.81);
		en.setFees(5678);
		en.setpMobile(876543653);
		en.setRollNo(123);
		en.setStd("B.TECH");
		System.out.println(en);
	}
	

}
