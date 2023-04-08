class one2{
    public static void main(String arg[]){
        int arr[] = new int[3];
        arr[0] = Integer.parseInt(arg[0]);  
        arr[1] = Integer.parseInt(arg[1]);  
        arr[2] = Integer.parseInt(arg[2]);  
        
        for(int j=0; j<3; j++){
            for(int i=0; i<2; i++){
                if(arr[i+1] > arr[i]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }    
            }
        }
        for(int i=0; i<3; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
