package dsa;

import java.util.Scanner;

public class BSUnsuccessfulAttempts {
  public static int search(int[] arr, int left, int right, int num, int attempts){
    //Base condition
    if(left > right){
      return attempts;
    }

    int mid = left + (right - left)/2 ;

    if(arr[mid] == num){
      return attempts;
    } else if ( arr[mid] > num){
      return search(arr, left, mid-1, num, ++attempts);
    } else {
      return search(arr, mid+1, right, num, ++attempts);
    }
  }
  public int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
    // Write your code here
    int attempts = search(inputArr, 0, inputArr.length-1 , key, 0);
    return attempts;
  }
  public static void main(String args[] ) throws Exception {
    BSUnsuccessfulAttempts bs = new BSUnsuccessfulAttempts();
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int array[] = new int[size];
    for (int i = 0; i < size; i++) {
      array[i] = scanner.nextInt();
    }
    int key = scanner.nextInt();
    System.out.println(bs.getBinarySearchUnsuccessfulComparisonCount(array, key));
  }
}
