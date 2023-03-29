package dsa;

import java.util.Scanner;

public class BubbleSortSwapCount {

  static int totalBubbleSortSwaps(int[] array, int M) {
    int size = array.length;
    int var = 0;
    int totalSwaps = 0;
    //Write your code here
    for (int i = 0; i < size; i++) {
      int swap = 0;
      for (int j = 1; j < size - i; j++) {
        if (array[j] > array[j - 1]) {
          //swapping when element at position j is greater than element at j-1 position.
          int temp = array[j];
          array[j] = array[j - 1];
          array[j - 1] = temp;
          swap = 1;
          totalSwaps++;
        }
      }
      if (swap == 0) {
        break;
      }
      var++;
      if (var == M) break;
    }
    return totalSwaps;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the no. of swaps :");
    int m = input.nextInt();
    System.out.println("Enter the no. of elements :");
    int n = input.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array :");
    for (int i = 0; i < n; i++) {
      arr[i] = input.nextInt();
    }
    System.out.println(totalBubbleSortSwaps(arr, m));
  }
}
