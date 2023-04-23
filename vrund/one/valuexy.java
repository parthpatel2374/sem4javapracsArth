import java.util.Scanner;

class valuexy
{
	public static void main(String arr[])
	{
	
		System.out.println("Enter Values of coefficients of given two eqution one by one");
		System.out.println("enter values for a,b,e,c,d,f in sequence");
		System.out.println("ax+by=e and cx+dy=f");
		
		Scanner v= new Scanner(System.in);
		float a=v.nextFloat();
		float b=v.nextFloat();
		float e=v.nextFloat();
		float c=v.nextFloat();
		float d=v.nextFloat();
		float f=v.nextFloat();
		float x=(e*d-f*b)/(a*d-b*c);
		float y=(a*f-c*e)/(a*d-b*c);
		
		System.out.println("value of x is " + x);
		System.out.println("value of y is " + y);
		v.close();
	}
}
