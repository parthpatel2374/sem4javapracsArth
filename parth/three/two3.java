class polygon2{
    int length, bredth;

    polygon2(){
        length = bredth = 1;
    }
    polygon2(int len){
        length = bredth = len;
    }
    polygon2(int len, int bre){
        length = len;
        bredth = bre;
    }
    int area(){
        return length*bredth;
    }
}
class two3 {
    public static void main(String arg[]){
        polygon2 square = new polygon2(10);
        polygon2 rectangle = new polygon2(10, 20);

        System.out.println("Area of square is : "+square.area());
        System.out.println("Area of rectangle is : "+rectangle.area());
    }   
}
