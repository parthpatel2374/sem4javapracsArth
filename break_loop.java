class break_loop{
	public static void main(String a[]){
		for(int i=0; i<100; i++){
			if(i==10){break;}
			System.out.println("i = "+i);
		}
		System.out.println("Loop Complete.");
	}
}