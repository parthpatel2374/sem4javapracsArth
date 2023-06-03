import java.util.Stack;

public class seven3 {

    static void evaluateExpr(String expr){
        Stack<Integer> numStack = new Stack<>();
        
        try{
            for(int i=0; i < expr.length(); i++){
                char c = expr.charAt(i);
                if(Character.isDigit(c)){

                    numStack.push(c - '0');
                }
                else{
                    
                    int int2 = numStack.pop();
                    int int1 = numStack.pop();
                    int ans = 0;

                    switch(c){

                        case '+':
                            ans = int1 + int2;
                            break;

                        case '-':
                            ans = int1 - int2;
                            break;

                        case '*':
                            ans = int1 * int2;
                            break;

                        case '/':
                            if(int1 == 0){
                                System.out.println("This Will Not Be Printed!!");
                            }
                            else{
                                ans = int1 / int2;
                            }
                            break;
                    }
                    numStack.push(ans);
                }
            }
            int finalAnsInInteger = numStack.pop();
            System.out.println("The ans of "+expr+" is "+finalAnsInInteger+".");
        }
        catch(ArithmeticException e){
            System.out.println("ErrorInExpression:"+expr+":ErrorIs:"+e.toString());
        }
    }

    public static void main(String[] args) {
        evaluateExpr("12+34-*");
        evaluateExpr("12+");
        evaluateExpr("30*2+0/");
    }
}