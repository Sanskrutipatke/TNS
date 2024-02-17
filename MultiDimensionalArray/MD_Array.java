package MultiDimensionalArray;

class MLArray
{
	static void printArray(int c[][])
	{
		System.out.println("Array Elements are as follows : ");
		System.out.println(" ");
		for (int i =0; i < c.length; i++)  //row
		{
			for (int j=0;j< c[i].length ; j++)  //column 
				System.out.print(c[i][j] + " ");
			System.out.println();
		}
		
	}
}



public class MD_Array {

	public static void main(String[] args) {
		
		int c[][]= { {12,45 } , {10,40} , {5 , 7}, {10,40} , {5, 7}  };  //new int [3][2];
		
		System.out.println("No. of Row in C array : "+ c.length);
		System.out.println(" ");
		
		MLArray.printArray(c);
		
		
	}
	}