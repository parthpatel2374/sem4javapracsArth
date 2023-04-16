import java.util.Scanner;
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of square : ");
        int sqLenght = sc.nextInt();
        polygon2 square = new polygon2(sqLenght);
        System.out.println("Area of square is : "+square.area());
        System.out.println();
        
        System.out.print("Enter the length and bredth of rectangle : ");
        int recLenght = sc.nextInt(), recBredth = sc.nextInt();
        polygon2 rectangle = new polygon2(recLenght, recBredth);
        System.out.println("Area of rectangle is : "+rectangle.area());
        sc.close();
    }
}
