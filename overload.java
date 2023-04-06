class overload_demo{
	void test(){
		System.out.println("No Parameters");
	}
	void test(int a){
		System.out.println("a = "+a);
	}
	void test(int a, int b){
		System.out.println("a & b = "+a+" "+b);
	}
	void test(double a){
		System.out.println("a = "+a);
	}
}
class overload{
	public static void main(String arg[]){
		overload_demo ob = new overload_demo();
		ob.test();
		ob.test(10);
		ob.test(10.9);
		ob.test(10, 20);
	}
}