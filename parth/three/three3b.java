import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    String city;

    Student(int rollno, String name, String city){
        this.rollNumber = rollno;
        this.name = name;
        this.city = city;
    }

    // Search function
    public static int[] search(Student[] arr, String name, int n){
        int array[] = new int[n], count=0;
        
        for(int i=0; i<n; i++){
            if(arr[i].name == name){
                array[count++] = i;
            }
        }
        return array;
    }
    public static int[] search(Student[] arr, int roll, int n){
        int array[] = new int[n], count=0;

        for(int i=0; i<n; i++){
            if(arr[i].rollNumber == roll){
                array[count++] = i;
            }
        }
        return array;
    }
    public static int[] search(Student[] arr, int roll, String city, int n){
        int array[] = new int[n], count=0;
        
        for(int i=0; i<n; i++){
            if(arr[i].rollNumber == roll && arr[i].city == city){
                array[count] = i;
            }
        }
        return array;
    }
    static void printarr(Student arr[], int array[], int n){
        for(int i=0; i<n; i++){
            System.out.println(arr[array[i]].rollNumber);
            System.out.println(arr[array[i]].name);
            System.out.println(arr[array[i]].city);
        }
    }
}
class three3b{
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int n = 3;//sc.nextInt();
        Student arr[] = new Student[n];
        int[] array = new int[n];
        
        System.out.println("Enter rollno, name and city of students;");
        
            arr[0] = new Student(1, "parth", "kapad");
            arr[1] = new Student(2, "vrund", "luna");
            arr[2] = new Student(3, "parth", "abad");

        System.out.println("1 for name.search,");
        System.out.println("2 for rollno.search,");
        System.out.println("3 for city&rollno.search.");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter name of student to be searched : ");
                String name = sc.nextLine();
                array = Student.search(arr, name, n);
                Student.printarr(arr, array, n);
                break;
            case 2:
                System.out.println("Enter rollnumber of student to be searched : ");
                int roll = sc.nextInt();
                array = Student.search(arr, roll, n);
                Student.printarr(arr, array, n);
                break;
            case 3:
                System.out.println("Enter rollnumber and city of student to be searched : ");
                int rollno = sc.nextInt(); String city = sc.nextLine();
                array = Student.search(arr, rollno, city, n);
                Student.printarr(arr, array, n);
                break;
            default:

        }
    /* 
        Student(1, "parth", "kapadwanj");
        Student(2, "jatin", "kapadwanj");
        Student(3, "ullekh", "kapadwanj");
        Student(4, "vrund", "lunavada");
        Student(5, "kathan", "ahmedabad");
        Student(6, "dip", "ahmedabad");
        Student(7, "kishan", "ahmedabad");
        Student(8, "chirag", "vadodra");

        // Search for all students with rollno 1
        ArrayList<Student> result = Student.search(students, 1);
        for (Student student : result) {
            System.out.println(student.getName());
        }
        
        // Search for all students with the name "parth"
        result = Student.search(students, "parth");
        for (Student student : result) {
            System.out.println(student.getName()); // Output: [Student@<hashcode>]
        }
        
        // Search for all students in ahmedabad and name = "dip"
        result = Student.search(students, "dip", "ahmedabad");
        for (Student student : result) {
            if (student.getName().equals("dip") && student.getCity().equals("ahmedabad") ) {
            System.out.println(student.getName());
            }
        }
    */
        sc.close();
    }
}