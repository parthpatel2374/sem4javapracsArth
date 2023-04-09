import java.util.ArrayList;

class Student {
    private int rollNumber;
    private String name;
    private String city;

    // Constructor
    public Student(int rollNumber, String name, String city) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.city = city;
    }

    // Getters
    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    // Overloaded search method
    public static ArrayList<Student> search(ArrayList<Student> students, int rollNumber) {
        ArrayList<Student> results = new ArrayList<Student>();
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                results.add(student);
            }
        }
        return results;
    }

    public static ArrayList<Student> search(ArrayList<Student> students, String name) {
        ArrayList<Student> results = new ArrayList<Student>();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                results.add(student);
            }
        }
        return results;
    }

    public static ArrayList<Student> search(ArrayList<Student> students, String name, String city) {
        ArrayList<Student> results = new ArrayList<Student>();
        for (Student student : students) {
            if (student.getName().equals(name) && student.getCity().equals(city)) {
                results.add(student);
                results.toString();
            }
        }
        return results;
    }
}
class three3 {
    public static void main(String arg[]){

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "parth", "kapadwanj"));
        students.add(new Student(2, "jatin", "kapadwanj"));
        students.add(new Student(3, "ullekh", "kapadwanj"));
        students.add(new Student(4, "vrund", "lunavada"));
        students.add(new Student(5, "kathan", "ahmedabad"));
        students.add(new Student(6, "dip", "ahmedabad"));
        students.add(new Student(7, "kishan", "ahmedabad"));
        students.add(new Student(8, "chirag", "vadodra"));

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
    }
}