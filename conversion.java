class conversion{
	public static void main(String a[]){
		byte b;
		int i=257;
		double d=323.142;
		System.out.println("Int to Byte:");
		b=(byte)i; 
		System.out.println("i & b = "+i+" "+b);
		System.out.println("Double to Int:");
		i=(int)d; 
		System.out.println("i & d = "+i+" "+d);
		System.out.println("Double to Byte:");
		b=(byte)d; 
		System.out.println("b & d = "+b+" "+d);
	
	}
}