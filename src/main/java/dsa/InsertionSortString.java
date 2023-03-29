package dsa;

import java.util.Scanner;

class InsertionSortString {

  public static void insertionSort(String[] array, String direction) {
    for(int i =1 ;i < array.length; i++){
      String v = array[i];
      int  j= i;

      while(j >= 1 && (direction == "desc" ? array[j-1].compareTo(v) < 0 : array[j-1].compareTo(v) > 0)){
        array[j] = array[j-1];
        j--;
      }

      array[j]= String.valueOf(v);
    }
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  public static void main(String ss[]) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    String firstNames[] = new String[size];
    String lastNames[] = new String[size];
    for (int i = 0; i < size; i++) {
      firstNames[i] = scanner.next().toLowerCase();
    }
    for (int i = 0; i < size; i++) {
      lastNames[i] = scanner.next().toLowerCase();
    }

    // Write your code here
    insertionSort(firstNames, "asc");
    insertionSort(lastNames, "desc");

  }
}
