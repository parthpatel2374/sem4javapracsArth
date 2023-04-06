class Box{
	double width, height, depth;
	
	Box(){
		width = height= depth = -1;
	}
	Box(double l){
		width = height= depth = l;
	}
	Box(double w, double h, double d){
		width = w; height = h; depth = d;
	}
	double vol(){
		return(width*height*depth);
	}
}
class over_demo{
	public static void main(String arg[]){
		Box ob1 = new Box();
		Box ob2 = new Box(10);
		Box ob3 = new Box(10, 20, 30);
		System.out.println("Vol of ob1 = "+ob1.vol());
		System.out.println("Vol of ob2 = "+ob2.vol());
		System.out.println("Vol of ob3 = "+ob3.vol());
	}
}