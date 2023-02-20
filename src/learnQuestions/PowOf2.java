package learnQuestions;
import java.util.Scanner;
public class PowOf2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // Enter the number
    int number = scan.nextInt();
    int result = 1;
    double power = 1.0;
    if(number >= 2) {
      while (result < number) {
        // Write the logic
        int calcPower = (int) Math.pow(2.0, power);
        if (calcPower < number) {
          result = calcPower;
        } else {
          break;
        }
        power++;
      }
      System.out.print(result);
    } else {
      System.out.print("Please enter an integer >= 2");
    }
    scan.close();
  }
}
