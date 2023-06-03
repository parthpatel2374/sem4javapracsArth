import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;

class SomeThing{

    private double Number_of_object;

    SomeThing(double a){
        Number_of_object = a;
    }
    SomeThing(SomeThing ob){
        this.Number_of_object = ob.Number_of_object;
    }

    public void doingWithSomes(){
        System.out.println("This is "+Number_of_object);
    }
}
public class seven2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter total numbers to enter : ");
        int num = sc.nextInt();

        List<SomeThing> Array_Of_Things = new ArrayList<>();

        while(num-- != 0){
            System.out.print("Enter Number For Object : ");
            Double value1 = sc.nextDouble();

            SomeThing TheThing1 = new SomeThing(value1);

            Array_Of_Things.add(TheThing1); 
        }
        
        System.out.println("The List is "+Array_Of_Things);

        System.out.println("\nEnter 999 to exit.");
        LABEL:
        for(int i=0; i<999; i++){
            
            System.out.println("\n1.Basic Operations");
            System.out.println("2.Iterating Over The List");
            System.out.println("//3.Search For Element In The List");
            System.out.println("//4.Sort The List");
            System.out.println("5.Copying The List");
            System.out.println("6.Shuffling Elements In The List");
            System.out.println("7.Reversing The The List");
            System.out.println("8.Getting Sub-List");
            System.out.println("//9.Converting The List To Array");
            System.out.println("//10.Converting The List Into a Stream");
            System.out.println("//11.Concurrent Lists");
            System.out.print("Enter_Your_Choice : ");
            int choice1 = sc.nextInt();
            
            switch(choice1){
                
                case 1:
                    System.out.println("\t1.Add_Element\n\t2.Go_To_Element\n\t3.Change_Element\n\t4.Remove_Element");
                    System.out.print("Enter_Choice : ");
                    int choice2 = sc.nextInt();
                                
                    switch(choice2){
                        case 1:
                            System.out.print("Enter Number For Object : ");
                            int value2 = sc.nextInt();
                            SomeThing TheThing2 = new SomeThing(value2);
                            Array_Of_Things.add(TheThing2);
                            break;
                            
                        case 2:
                            System.out.print("Enter Where To Go : ");
                            int index1 = sc.nextInt();
                            System.out.println(Array_Of_Things.get(index1));
                            break;
                            
                        case 3:    
                            System.out.print("Enter Number For Object : ");
                            int value3 = sc.nextInt();
                            SomeThing TheThing = new SomeThing(value3);
                            System.out.print("Enter Index Of Element To Change : ");
                            int index2 = sc.nextInt();
                            Array_Of_Things.remove(index2);
                            Array_Of_Things.add(index2, TheThing);
                            break;
                            
                        case 4:    
                            System.out.print("Enter Index Of Element To Remove : ");
                            int index3 = sc.nextInt();
                            Array_Of_Things.remove(index3);
                            break;
                        
                        default:
                            System.out.println("\nEnter_Valid_Choice_!\n");
                            break;
                    } 
                    System.out.println("TheFinalList: "+Array_Of_Things);
                    break;
                
                case 2:
                    System.out.println("The List With The Use Of Iteration: ");
                    for(Iterator<SomeThing> i2=Array_Of_Things.iterator(); i2.hasNext();){
                        System.out.println(i2.next()+" ");
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter Number Of Object : ");
                    //int number = sc.nextInt();
                    for(Iterator<SomeThing> index = Array_Of_Things.iterator(); index.hasNext();){
                        
                        
                    }

                    

                    break;
                    
                case 4:
                    Array_Of_Things.sort(null);
                    System.out.println("TheSortedList: "+Array_Of_Things);
                    break;
                
                case 5:
                    List<SomeThing> newList1 = new ArrayList<>();
                    newList1.addAll(Array_Of_Things);
                    System.out.println("TheMainList: "+Array_Of_Things);
                    System.out.println("TheNewCopy-List: "+newList1);
                    break;
                
                case 6:
                    System.out.print("Enter Index Of Both Elements To Shuffle : ");
                    int mainIndex = sc.nextInt(), suffleIndex = sc.nextInt();

                    SomeThing Thing1 = (Array_Of_Things.get(mainIndex));
                    SomeThing Thing2 = (Array_Of_Things.get(suffleIndex));
                    Array_Of_Things.remove(mainIndex);
                    Array_Of_Things.add(mainIndex, Thing2);
                    Array_Of_Things.remove(suffleIndex);
                    Array_Of_Things.add(suffleIndex, Thing1);
                    System.out.println("TheShuffeledList:"+Array_Of_Things);
                    break;
                
                case 7:
                    Collections.reverse(Array_Of_Things);
                    System.out.println("TheReverseList: "+Array_Of_Things);
                    break;
                
                case 8:
                    List<SomeThing> newList2 = new ArrayList<>();
                    System.out.print("Enter StartIndex and EndIndex For Sub-List : ");
                    int startIndex = sc.nextInt(), endIndex = sc.nextInt();
                    newList2 = Array_Of_Things.subList(startIndex, endIndex);
                    System.out.println("TheNewSub-List: "+newList2);
                    break;
                    
                case 9:
                    System.out.println("TheArrayedList: "+Array_Of_Things.toArray());
                    break;
                
                case 10:
                    //Stream<SomeThing> stream = convertToStream(Array_Of_Things);
                    //System.out.println("Stream from List: "+Array_Of_Things.toString(stream.toArray()));
                    break;
                
                case 11:

                    break;
                 
                case 999:
                break LABEL;

                default:
                    System.out.println("\nEnter_Valid_Choice_!\n");
                    break;
            }
        }

        sc.close();
    }
}
