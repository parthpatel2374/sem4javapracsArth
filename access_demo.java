class test{
	int a;
	public int b;
	private int c;
	void setc(int i){
		c = i;
	}
	int getc(){
		return c;
	}
}
class access_demo{
	public static void main(String arg[]){
		test ob = new test();
		ob.a = 10;
		ob.b = 20;
		// ob.c = 30;
		ob.setc(30);
		System.out.println("a = "+ob.a+" "+"b = "+ob.b+" "+"c = "+ob.getc());
	}
}