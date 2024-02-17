package SingleDimensionArray;


import java.util.Arrays;

public class Array_2 {

	public static void main(String[] args) {
	
		
		//get the array
		
		int intArr[]= {69,20,12,40,35};
		
	
		
		//print the array 
		
		System.out.println(Arrays.toString(intArr));
		for( int i=0;i<intArr.length;i++)
		{
			System.out.println(intArr[i]);
			System.out.println(" ");
		}
		
		//sort
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		System.out.println(" ");
		
		//binary Search 
	// int key=7;
	 System.out.println(Arrays.binarySearch(intArr, 35));
	 System.out.println(" ");

	 System.out.println(Arrays.binarySearch(intArr, 2, 4, 35));
	 System.out.println(" ");
	 
	 //comparison
	 
	 System.out.println(Arrays.toString(intArr));
	 System.out.println(" ");
	 
	 //get the second array
	 int intArr1[]= {69,20,12,40,35};
	// System.out.println(Arrays.toString(intArr1));
	 System.out.println(" ");
	 
		//sort
	//	Arrays.sort(intArr1);
		System.out.println(Arrays.toString(intArr1));
		System.out.println(" ");
	 
	 //compare both the arrays
	 if(Arrays.compare(intArr, intArr1)==0)
	 {
		 System.out.println("Both the arrays are same ");
		 System.out.println(" ");
	 }
	 else
	 {
		 System.out.println("Both arrays are not same ");
		 System.out.println(" ");
	 }
	 
	 //copy array
	 int intArr2[]=Arrays.copyOf(intArr1, 2);
	 System.out.println(Arrays.toString(intArr2));
	 System.out.println(" ");
	 
	 int intArr3[]=Arrays.copyOfRange(intArr, 1, 4);
	 System.out.println(Arrays.toString(intArr3));
	 System.out.println(" ");
	 
	 //Fill method 
	 Arrays.fill(intArr3, 7);
	 System.out.println(Arrays.toString(intArr3));
	 System.out.println(" ");
	 
	}
	}
