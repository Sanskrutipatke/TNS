package SingleDimensionArray;

class ArrayOperations
{
	//print int array
	static void printArray(int[] arr) {
		for( int i=0;i<arr.length;i++)
		
			System.out.print(arr[i] + "\t");
		System.out.println();
		
	}
	
	//variable argument function
	public static int getSum(int... n)
	{
		int sum=0;
		for(int no : n)
			sum += no;
		return sum;
		
	}
	
	//count no. of odd elements
	public static int getOddCount(int b[])
	{
		int count=0;
		for(int i=0; i< b.length; i++)
		{ 
			if (b[i] % 2 != 0)
				count++;
		}
		return count;
		
	}
	
	//count no. of even elements
	
	public static int getEvenCount(int b[])
	{
		return b.length-getOddCount(b);
		
	}
	
	
}

//Driver Class
public class Array_1 {

	public static void main(String[] args) {
		
		int n=10;
		int a[]; //declaration
		a=new int[n]; //instantiation
		
		//displaying the array
		ArrayOperations.printArray(a);
		
		//assigning values in array a
		for(int i=0; i<a.length;i++)
			a[i]=5*i;
		
		ArrayOperations.printArray(a);
		
		int b[]= { 10,20,30,40,50};  //initialization at the time of declaration 
		ArrayOperations.printArray(b);
		
		
		//calling varible argument function 
		System.out.println("  ");
		System.out.println("sum of array elemnts is : " + ArrayOperations.getSum(b));
		System.out.println("  ");
		System.out.println("sum of array elemnts is :" + ArrayOperations.getSum(10,20,60,90,70,76));
		System.out.println("  ");
		b[2] = 999; //assigning single elements
		//b[20]=67; //RTE
		ArrayOperations.printArray(b);
		
		//Display total no of odd and even
		System.out.println("  ");
		System.out.println("Odd number : "+ ArrayOperations.getOddCount(b) + "\t Even numbers :" + ArrayOperations.getEvenCount(b));
		System.out.println();
		System.out.println("-----------------------------------------------");
		
		
		//int c[];
	//	ArrayOperations.printArray(c);//CTE
		
		
	}
}

