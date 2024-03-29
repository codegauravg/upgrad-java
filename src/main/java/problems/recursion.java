package problems;

import java.util.Arrays;

public class recursion {
  public static void factorial1(int n) {

    int factorial = 1;
    int index = 1;
    for (int i = 0; i <= Math.pow(n, n); i++) {
      if (i == factorial * index) {
        factorial = i;
        index += 1;
        if (index == n + 1) {
          System.out.println(factorial);
          break;
        }
      }
    }
  }

  public static void factorial2(int n) {
    int[] factorials = new int[n + 1];
    Arrays.fill(factorials, 1);
    for (int i = 0; i <= n - 1; i++) {
      factorials[i + 1] = (i + 1) * factorials[i];
    }
    System.out.println(factorials[n]);
  }

  public static void main(String[] args) {
    factorial1(5);
    factorial2(5);
  }
}
