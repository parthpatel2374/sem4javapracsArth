class four2 {
    public static void main(String arg[]){
        int op1 = Integer.parseInt(arg[0]);
        int op2 = Integer.parseInt(arg[2]);

        switch(arg[1]){
            case "=":
                if(op1==op2)
                    System.out.println("true");
                else{
                    System.out.println("false");
                }
                break;
            case ">":
                if(op1>op2){
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }
                break;
            case "<":
                if(op1<op2){
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }
                break;
            case "+":
                System.out.println("operator1 + operator2 = "+(op1+op2));
                break;
            case "-":
                System.out.println("operator1 - operator2 = "+(op1-op2));
                break;
            case "x":
                System.out.println("operator1 x operator2 = "+(op1*op2));
                break;
            case "/":
                if(op2 == 0){
                    System.out.println("Division not possible.");
                }
                else{   
                    System.out.println("operator1 / operator2 = "+((double)op1/op2));
                }
                break;
            default:
                System.out.println("Enter valid operator.");
        }
    }    
}