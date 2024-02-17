package MultiDimensionalArray;

class J_Array {
	static void printArray(int d[][])
	{
		for (int i=0; i<d.length; i++)
		{
			for (int j=0; j<d[i].length; j++)
				System.out.print(d[i][j] + " ");
			System.out.println();
		}
	}
}


public class JaggedArray {

	public static void main(String[] args) {
	
		int d[][]= { {10,20,30} , {40}, {12,24,36,48}, {11,110} };

		System.out.println("Total Rows in Array " + d.length);
		System.out.println(" ");
		
		J_Array.printArray(d);
		
	}
}
