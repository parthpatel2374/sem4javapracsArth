class usestatic{
	static int a=3;
	static int b;
	static void mthd(int x){
		System.out.println("x = "+x);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	static{
		System.out.println("Static block initialised.");
		b = a * 4;
	}
	public static void main(String arg[]){
		mthd(42);
	}
}