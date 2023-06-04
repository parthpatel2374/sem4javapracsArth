import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class seven4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        
        System.out.println("The Queue Is: "+queue);
        System.out.println("Enter 999 to break.");
Label:
    for(int i=0; i<999; i++){
        System.out.println("1. Offer Element,\n2. To Remove Front Element,\n3. Peek Element,");
        System.out.println("4. Clear Queue,\n5. Contains For Checking Element,\n6. RemoveAll Element,");
        System.out.println("7. Retain All,\n8. Size\n9. ToArray,\n10. Is Empty Check.");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1: 
                System.out.print("Enter element to Offer to queue: ");
                int element = sc.nextInt();
                queue.offer(element);
                System.out.println("QueueIs: "+queue);
                break;
            
            case 2: 
                System.out.println("ElementRemovedIs: "+queue.remove());
                break;

            case 3:
                System.out.println("ElementPeekedIs: "+queue.peek());
                break;
            
            case 4:
                queue.clear();
                System.out.println("QueueIs: "+queue);
                break;

            case 5: 
                System.out.print("Enter element to be Checked: ");
                int ele_Check = sc.nextInt();
                if(queue.contains(ele_Check)){
                    System.out.println("Element is there in the queue.");
                }
                else{
                    System.out.println("The element is not there.");
                }
                break;

            case 6: 
                Queue<Integer> queue1 = new LinkedList<>();
                queue1.offer(1);
                queue1.offer(2);
                queue.removeAll(queue1);
                System.out.println("NewQueueIs: "+queue1);
                System.out.println("OriginalQueueIs: "+queue);
                break;
                
            case 7:
                Queue<Integer> queue2 = new LinkedList<>();
                queue2.offer(1);
                queue2.offer(2);
                queue.retainAll(queue2);
                System.out.println("NewQueueIs: "+queue2);
                System.out.println("OriginalQueueIs: "+queue);
                break;

            case 8:
                System.out.println("Size of the Queue is: "+queue.size());
                break;
            
            case 9:
                Object[] array = queue.toArray();
                System.out.println("Queue to Array is: ");
                for(int x=0; x<array.length; x++){
                    System.out.print(" "+array[x]);
                }
                System.out.println();
                break;

            case 10:
                if(queue.isEmpty()){
                    System.out.println("The queue is empty.");
                }
                else{
                    System.out.println("The queue is: "+queue);
                }
                break;
            case 999:
                break Label;
        }
    }
        sc.close();
    }

}
