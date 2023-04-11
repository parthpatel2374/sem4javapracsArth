import java.util.Scanner;

class metretofeet
{
	public static void main(String arr[])
	{
		System.out.println("enter value which you want to convert into metre to feet");
		Scanner v= new Scanner(System.in);
		float a= v.nextFloat();
		double b= a*3.28084;
		System.out.println(a + "meter is equal to " +  b + " feet");
	}
}