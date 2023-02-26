package learnQuestions;

import java.util.*;
public class smallestOfThree {
  public static void main(String[] args) {

    int n1, n2, n3;
    Scanner input = new Scanner(System.in);
    n1 = input.nextInt();
    n2 = input.nextInt();
    n3 = input.nextInt();

    if (n1 < n2) {
      if (n2 < n3) {
        System.out.println("The smallest number entered is "+n1);
      } else if (n3 < n2) {
        System.out.println("The smallest number entered is "+n3);
      }
    } else {
      if (n2 < n3) {
        System.out.println("The smallest number entered is "+n1);
      } else {
        System.out.println("The smallest number entered is "+n3);
      }
    }
  }
}
