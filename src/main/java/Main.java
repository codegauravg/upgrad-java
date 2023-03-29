import java.sql.Array;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    int var1 = 5;
    System.out.println(++var1);
    System.out.println(var1);

    int var2 = 5;
    System.out.println(var2++);
    System.out.println(var2);

    float var3 = 5.89f;
    System.out.println(var3);

    double var4 = 5;
    System.out.println(var4);

    int a = 5; int b = 4; int c = 3;
    int z = a + b - c * a;
    System.out.println(z);

    char e=56;
    System.out.println(e);

    boolean logical = true || false && !true;
    System.out.println(logical);

    printBackwards(new int[]{1, 2, 3, 4, 5});

    ArrayList<Integer> studentList = new ArrayList<Integer>();

    studentList.add(222);
    studentList.add(250);
    studentList.add(1, 340);
    studentList.add(400);
    studentList.add(1, 500);

    System.out.println(studentList);

    ArrayList<Float> random = new ArrayList<Float>();
    random.add(2f);
    random.add(4f);
    random.add(5f);
    random.add(10f);
    random.add(99.9f);
    System.out.println(random.contains(5.0));
    System.out.println(random.contains(5f));
  }

  public static void printBackwards(int[] numbers) {
    for(int i=numbers.length-1; i > 0; i--) {
      System.out.println(numbers[i]);
    }
  }
}