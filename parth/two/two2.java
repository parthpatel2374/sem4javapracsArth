import java.util.Scanner;

class two2 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter values in the array;");
        for(int i=0; i<n; i++){
            int val = sc.nextInt();
            arr[i] = val;
        }
        boolean choice;
        do{    
        System.out.println("Do you want to add more elements?[true/false]");
        choice = sc.nextBoolean();
        if(choice){
            System.out.print("Enter number of elements to enter:");
            int m = sc.nextInt(), k=m+n;
            int temp[] = new int[k];
                for(int i=0; i<n; i++){
                    temp[i] = arr[i];
                }
                System.out.println("Enter other elements;");
                for(int i=n; i<k; i++){
                    int val = sc.nextInt();
                    temp[i] = val;
                }
                arr = temp;
                n = k;
                System.out.print("The array is :");
                for(int i=0; i<k; i++){
                    System.out.print(" "+arr[i]+" ");
                }
                System.out.println();
            }
        }while(choice);
        sc.close();
    }
}
