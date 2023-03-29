package dsa;

import java.util.Scanner;

public class InsertionSortDesc {

  public static void insertSortDesc(int[] arr){
    for(int i = 1 ; i < arr.length; i++){
      // v: element at i'th position in array
      int v = arr[i];
      // j: position i
      int j = i;

      // Loop until j is greater than or equal to 1 and element before is greater than element at i'th position
      while(j>=1 && arr[j-1]<v){
        arr[j]=arr[j-1];
        j--;
      }

      arr[j]=v;
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = input.nextInt();
    }
    insertSortDesc(arr);
    for (int i = 0; i < arr.length; ++i) {
      System.out.println(arr[i]);
    }
  }
}

