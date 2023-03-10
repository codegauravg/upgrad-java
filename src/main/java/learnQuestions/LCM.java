package learnQuestions;
import java.util.Scanner;
public class LCM {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // Enter the two numbers in the input console
    int number1 = scan.nextInt();
    int number2 = scan.nextInt();
    System.out.print(lcm(number1, number2));
  }

  // Write the LCM function here
  public static int lcm(int n1, int n2) {
    int lcm = (n1 > n2) ? n1 : n2;

    // Always true
    while(true) {
      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
        break;
      }
      ++lcm;
    }
    return lcm;
  }
}
