class A{
	int i, j;
	void showij(){
		System.out.println("i & j = "+i+" "+j);
	}
}
class B extends A{
	int k;
	void showk(){
		System.out.println("k = "+k);
	}
	void sum(){
		System.out.println("Sum = "+(i+j+k));
	}
}
class inherit_demo{
	public static void main(String arg[]){
		B subob = new B();
		subob.i = 10;
		subob.j = 20;
		subob.k = 30;
		subob.showij();
		subob.showk();
		subob.sum();
	}
}