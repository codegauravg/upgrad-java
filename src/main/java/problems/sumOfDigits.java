package problems;

import java.util.Scanner;

public class sumOfDigits {
  public static int sum(int n) {
    //write the logic here
    int add = n % 10;
    if(n == 0)
    {
      return 0;
    }
    else
    {
      return add + sum(n / 10);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println(sum(num));
  }
}
