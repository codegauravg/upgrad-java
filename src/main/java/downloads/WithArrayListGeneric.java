import java.util.*;

public class WithArrayListGeneric {
  public static void main(String[] args) {
    ArrayList<StudentFour> studentList = new ArrayList<StudentFour>();
    studentList.add(new StudentFour("Sujit", 1));
    studentList.add(new StudentFour("Siddharth", 2));
    // studentList.add(new String("Hari")); // this would lead to compile error 
    studentList.add(new StudentFour("Karanpreet", 3));
    studentList.add(new StudentFour("Hari", 5));
    studentList.add(new StudentFour("Tricha", 4));


    printStudentList(studentList);
  }

  public static void printStudentList(ArrayList<StudentFour> students) {
    for(StudentFour s : students) {
    	// Student s = (Student) o;
      System.out.println(s.getDetails());
    }
  }
}

class StudentFour {
  private final String name;
  private final int rollNumber;

  public StudentFour(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
  }

  public String getDetails() {
    return
      "name = " + this.name + '\n' +
      "roll number = " + this.rollNumber + '\n';
  }
}

/*
  SUMMARY
  =======
  1. ArrayList Simple way to representation a dataset which is a collection of elementary data items.
  2. This is a type-safe approach of creating containers. Any attempt to add an element which is
      type-incompatible with the declared contained type will fail at the static type checking stage,
      resulting in a compile error.

*/
