class scope{
	public static void main(String a[]){
		int x;
		x=10;
		if(x==10){
			int y=20;
			System.out.println("X & Y = "+x+" "+y);
			x=y*2;
		}
/*		y=100;  */
		System.out.println("X = "+x);
	}
}