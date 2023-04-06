import java.util.Scanner;
import java.text.DecimalFormat;

class onethree {
    public static void main(String arg[]){    
        System.out.println("Enter the number in meters;");
        Scanner sc = new Scanner(System.in);
        
        double num = sc.nextDouble();
        DecimalFormat df = new DecimalFormat("#.##");
        
        double feet = (num * 3.281);
        System.out.println("The meter value of entered number is : "+df.format(num));
        System.out.println("The feet value of entered number is : "+df.format(feet));
        
        sc.close();
    }
}
/* Took reference of how to use scanner from 
   https://www.geeksforgeeks.org/scanner-class-in-java/ 
 */