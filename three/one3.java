class polygon1{
    int length, bredth;

    int area(int len){
        return len*len;
    }
    int area(int len, int bre){
        return len*bre;
    }
}
class one3 {
    public static void main(String arg[]){
        polygon1 square = new polygon1();
        polygon1 rectangle = new polygon1();

        System.out.println("Area of square is : "+square.area(10));
        System.out.println("Area of rectangle is : "+rectangle.area(10, 20));
    }   
}
