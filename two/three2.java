class three2 {
    public static void main(String arg[]){
        int arr[][] = new int[4][];
        for(int i=1; i<5; i++){
            arr[i-1] = new int[i];
        }
        int k=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = k++;
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }    
}
