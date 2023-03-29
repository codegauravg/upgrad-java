package gradedQuestions;

public class Employee {
  Integer salary;
  int EmpId;
  String EmpName;

  void display() {
    System.out.println(EmpId);
    System.out.println(EmpName);
    System.out.println(salary);
  }

  public static void main(String args[]) {
    Employee object = new Employee();
    object.display();
  }
}

/*
* Output:
* 0
* null
* null
* */

/*
* Explanation
* There is no constructor in the given class, and thus, the class variables EmpId, EmpName, and salary are not initialised. Thus, both the integer and the string variables are set to the default values, which are 0 and null respectively for int and string variables whereas salary is an object of ‘Integer’ class whose default value is null. Integer is a class which contains methods like ‘parseInt()’ and store references to integer objects on the other hand, ‘int’ is a primitive data type that defines the type of instance variables.Thus, this option is the correct choice.
* */
