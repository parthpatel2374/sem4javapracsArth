class box{
	double width, height, depth;
	void setdim(double w, double h, double d){
		width = w; height = h; depth = d;
	}
	double vol(){
		return(width*height*depth);
	}
}
class box_demo{
	public static void main(String arg[]){
		box ob1 = new box();
		box ob2 = new box();
		ob1.setdim(10, 20, 30);
		ob1.setdim(1, 2, 3);
		System.out.println("Vol of ob1 = "+ob1.vol());
		System.out.println("Vol of ob2 = "+ob2.vol());
	}
}