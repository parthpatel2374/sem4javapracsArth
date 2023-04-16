import java.util.Scanner;

class four1 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any letter : ");
        char let = sc.next().toLowerCase().charAt(0);
        
        if(let == 'a' || let == 'e' || let == 'i' || let == 'o' || let == 'u'){
            System.out.println("Entered character is a vovel.");
        }
        else{
            System.out.println("Entered character is a consonant.");
        }
        sc.close();
    }    
}
