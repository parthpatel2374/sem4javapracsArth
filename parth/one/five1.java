import java.util.Scanner;

class five1 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        
        System.out.print("Enter three numbers : ");
        for(int i=0; i<3; i++){
            arr[i] = sc.nextInt();
        }
        for(int j=0; j<3; j++){
            for(int i=0; i<2; i++){
                if(arr[i+1] > arr[i]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }    
            }
        }
        System.out.print("The numbers in sorted order are : ");
        for(int i=0; i<3; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();
    }    
}
