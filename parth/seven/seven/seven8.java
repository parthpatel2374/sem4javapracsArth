package seven;

import java.lang.Number;

public class seven8 {
    public static void main(String[] args) {
        stack<Integer> a = new stack<>(10); 
        stack<Double> d = new stack<>(10);
        
        a.push(10);
        a.push(40);
        a.push(23);
        a.push(12);
        
        d.push(12.21);
        d.push(51.12);
        d.push(34.23);
        d.push(13.21);

        System.out.println("Maximum is: "+max(a));
        System.out.println("Maximum  is: "+max(d));

    }

    public static double max(stack<? extends Number> stack) { 

        double max = stack.pop().doubleValue(); // Initialize max
        
        while (!stack.isEmpty()) {
            double value = stack.pop().doubleValue(); 
            if (value > max)
                max = value;
        }
        return max; 
    }
        
}
