package seven;

import java.util.ArrayList;

public class stack<T>{

    private ArrayList<T> obj;
    private int top = -1, size;
    
    stack(int number){
        this.obj = new ArrayList<T>(number);
    }

    public void setSize(int size){
        this.size = size;
    }

    public void push(T ob_to_push){
        if(top == size - 1){
            System.out.println("Stack owerflow.");
        }
        else
        {    
            obj.add(++top, ob_to_push);;
        }
    }

    public T pop(){
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
    
    public T peek(){
        if(top == -1){
            System.out.println("Stack underflow.");
            return null;
        }
        else{
            return obj.get(top);
        }
    }

    public void printStack(){
        System.out.println(obj);
    }

    public boolean isEmpty(){
        if(top == -1){ return true;}
        else{ return false;}
    }
    
    public boolean isFull(){
        if(top == size - 1){ return true;}
        else{ return false;}
    }
}
    

