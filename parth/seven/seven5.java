import java.util.PriorityQueue;

public class seven5{

    static class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable{
        @Override
        public Object clone() throws CloneNotSupportedException{
            MyPriorityQueue<E> clone = new MyPriorityQueue<>();
            this.forEach(clone::offer);
            return clone;
        }
    }
    public static void main(String[] args) {
        MyPriorityQueue<String> queue = new MyPriorityQueue<>();

        queue.offer("John");
        queue.offer("Malik");
        queue.offer("Farrah");
        queue.offer("Mia");

        MyPriorityQueue<String> cloned_queue = null;

        try{
            cloned_queue = (MyPriorityQueue<String>)(queue.clone());
        }
        catch(CloneNotSupportedException e){
            System.out.println(e.toString());
        }
        System.out.println("The Cloned Queue Is: "+cloned_queue);
    }
}