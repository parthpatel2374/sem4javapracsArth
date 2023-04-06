class useStatic{
	static int a=3;
	static int b=99;
	static void mthd(int x){
		System.out.println("x = "+x);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
class static_demo{
	public static void main(String arg[]){
		useStatic.mthd(42);
	}
}
