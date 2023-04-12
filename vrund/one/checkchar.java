import java.util.Scanner;

class checkchar
{
	public static void main(String arr[])
	{
		Scanner v= new Scanner(System.in);
		System.out.println("Enter a letter : ");
		char ab = v.nextLine().toLowerCase().charAt(0);
		//System.out.println(ab);
		if(ab== 'a' || ab=='e' || ab=='i' || ab=='o' || ab=='u')
		{
			System.out.println("entered character is vowel");
		}
		else
		{
			System.out.println("entered character is  consonent");
		}
		v.close();
	}
}
