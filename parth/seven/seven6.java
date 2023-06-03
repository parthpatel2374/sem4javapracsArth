import java.util.ArrayList;
import java.util.Scanner;

class stack<T>{

    ArrayList<T> obj;
    int top = -1, size;
    
    stack(){
        this.obj = new ArrayList<T>();
    }

    void setSize(int size){
        this.size = size;
    }

    void push(T ob_to_push){
        if(top == size - 1){
            System.out.println("Stack owerflow.");
        }
        else
        {    
            obj.add(++top, ob_to_push);;
        }
    }

    T pop(){
        if(top == -1){
            System.out.println("Stack underflow.");
            return null;
        }
        else{
            T temp = obj.get(top);
            obj.remove(top--);
            return temp;
        }
    }
    
    T peek(){
        if(top == -1){
            System.out.println("Stack underflow.");
            return null;
        }
        else{
            return obj.get(top);
        }
    }

    void printStack(){
        System.out.println(obj);
    }

    boolean isEmpty(){
        if(top == -1){ return true;}
        else{ return false;}
    }
   
    boolean isFull(){
        if(top == size - 1){ return true;}
        else{ return false;}
    }
}

public class seven6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        stack<Double> stack1 = new stack<>();
        stack<String> stack2 = new stack<>();

        System.out.print("Give total size of stack: ");
        int size = sc.nextInt();
        stack1.setSize(size);
        stack2.setSize(size);
        
outerLabel:
    for(int iterator=0; iterator<5; iterator++){
        System.out.println("Enter 999 to exit from UsrStackChoice\nEnter 777 to exit from IndividualStack.");
        System.out.println("1. DoubleStack && 2. StringStack.");
        System.out.println("Enter your choice: ");
        int usrChoice = sc.nextInt();
        switch(usrChoice){
        
        case 1:
label1: for(int i=0; i<20; i++){
            System.out.println("1. Push,\n2. Pop,\n3. Peek.");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice){

                case 1: 
                    if(stack1.isFull()){ System.out.println("Stack owerflow.");}
                    else{
                        System.out.println("Enter the element to push: ");
                        Double element = sc.nextDouble();
                        stack1.push(element);
                        stack1.printStack();
                    }
                    break;

                case 2:
                    if(stack1.isEmpty()){ System.out.println("Stack underflow.");}
                    else{
                        System.out.println("Element "+stack1.pop()+" has been removed.");
                    }
                    break;

                case 3:
                    if(stack1.isEmpty()){ System.out.println("Stack underflow.");}
                    else{
                        System.out.println("Element at top is: "+stack1.peek());
                    }   
                    break;
                
                case 777:
                    break label1;
                
            }
        }
            break;
        
        case 2:
label2: for(int i=0; i<20; i++){
            System.out.println("1. Push,\n2. Pop,\n3. Peek.");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice){

                case 1: 
                    if(stack2.isFull()){ System.out.println("Stack owerflow.");}
                    else{
                        System.out.println("Enter the element to push: ");
                        String element = sc.next();
                        stack2.push(element);
                        stack2.printStack();
                    }
                    break;

                case 2:
                    if(stack2.isEmpty()){ System.out.println("Stack underflow.");}
                    else{
                        System.out.println("Element "+stack2.pop()+" has been removed.");
                    }
                    break;

                case 3:
                    if(stack2.isEmpty()){ System.out.println("Stack underflow.");}
                    else{
                        System.out.println("Element at top is: "+stack2.peek());
                    }   
                    break;
                
                case 777:
                    break label2;
                
            }
        }
            break;

        case 999:
            break outerLabel;
        }
    }
        sc.close();
    }
}
