import java.util.Scanner;

/* palindrome = 101 if rev is 101*/

public class Palindrome_num {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		int og_num = num;
        int rev =0;
        
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		//System.out.println("reverse :"+rev);
		
		
		if(og_num == rev)
		{
			System.out.println("Palindrome number ");
			
		}
		else {
			System.out.print("Not a palindrome number");
		}
	}

}
