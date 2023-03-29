package problems;

import java.util.Scanner;

public class MoveAllZeroesToTheEnd {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = s.nextInt();
    moveZerosToEnd(arr);
    for (int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
  }

  // Method to find move all zeros to the end of the array
  static void moveZerosToEnd(int[] arr) {
    // Write your code here
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        arr[count] = arr[i];
        count++;
      }
    }
    while (count < arr.length) {
      arr[count] = 0;
      count++;
    }
  }
}

/*
 Input:
 9
 5 8 0 15 6 0 1 0 13

 Output:
 5 8 15 6 1 13 0 0 0
*/
