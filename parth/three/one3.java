import java.util.Scanner;
class polygon1{
    int length, bredth;

    polygon1(){
        length = bredth = -1;
    }
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

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of square : ");
        int sqLenght = sc.nextInt();
        System.out.println("Area of square is : "+square.area(sqLenght));
        System.out.println();
        
        System.out.print("Enter the length and bredth of rectangle : ");
        int recLenght = sc.nextInt(), recBredth = sc.nextInt();
        System.out.println("Area of rectangle is : "+rectangle.area(recLenght, recBredth));
        sc.close();
    }   
}
