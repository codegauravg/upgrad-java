package learnQuestions;
import java.util.Scanner;

public class HCF {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    // Enter number 1 in the Input Console
    int num1 = scan.nextInt();
    // Enter number 2 in the Input Console
    int num2 = scan.nextInt();

    int hcf = 1;
    // Write logic
    int count = ((num1 < num2) ? num1 : num2)/2;
    while (count > 0) {
      if (num1%count == 0 && num2%count == 0) {
        hcf = count;
        break;
      }
      count--;
    }
    // Check if hcf is the smallest number itself
    if (hcf == 1) {
      if (num1 < num2 && num2%num1 == 0) {
        hcf = num1;
      } else if (num2 < num1 && num1%num2 == 0) {
        hcf = num2;
      }
    }

    System.out.print(hcf);
    scan.close();
  }
}
