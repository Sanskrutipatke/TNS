package MultiDimensionalArray;

public class ArrayObject {
	
public static void main(String[] args) {

		
		//declare an Array of integer;
		
		Student[]  arr;
		
	
		
		//alocated memory for 5 object of type student 
		arr=new Student[5];
		for (int i=0; i< arr.length; i++)
			System.out.println("Elements at " + i + ": " + arr[i].getRollNo()+ " " + arr[i].getName());
		
		
		arr[0] = new Student(1, "Shubham");
		
		arr[1] = new Student(2, "Aakash");
		arr[2] = new Student(3, "Toukir");
		arr[3] = new Student(4, "Vidya");
		arr[4] = new Student(5, "Rohan");
		
		
		for (int i=0; i< arr.length; i++)
			System.out.println("Elements at " + i + ": " + arr[i].getRollNo()+ " " + arr[i].getName());
	}

}
