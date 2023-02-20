package liveClass;

import java.util.ArrayList;
import java.util.Arrays;

// Deadline: 14/01/2023 EOD
// Email answers to sircarrahul1@gmail.com
// What are JVM, JRE & JDK?
// What are primitive data types in JAVA?
// What are the range for different data types?

public class JavaCourseIAssignment {
  public static void main(String[] args) {
    int[] arr = {1, 56, 7, 97, 28, 96, 12, 99};
    System.out.println("Input array is " + Arrays.toString(arr));
    // Write a Java program to find the maximum and minimum value of an array.
    int[] minAndMax = findMinAndMax(arr);
    System.out.println("Minimum of array is " + minAndMax[0]);
    System.out.println("Maximum of array is " + minAndMax[1]);

    // Write a Java program to reverse an array of integer values
    int[] reversedArr = reverseArray(arr);
    System.out.println("Reversed array is " + Arrays.toString(reversedArr));

    // Write a Java program to remove a specific element from an array.
    int eleToRemove = 28;
    ArrayList<Integer> reducedArr = removeEleFromArray(arr, eleToRemove);
    System.out.println("Array after removal of element " + eleToRemove + " is " + reducedArr);

    // Write a Java program to find the index of an array element.
    int element = 96;
    int indexOfEle = findIdxOfEleInArray(arr, element);
    System.out.println("Index of element in array is " + indexOfEle);

    // Write a Java program to test if an array contains a specific value.
    boolean eleInArr = ifEleInArray(arr, element);
    System.out.println("Is element in array ? " + eleInArr);
  }

  private static boolean ifEleInArray(int[] arr, int element) {
    boolean verdict = false;

    for (int i=0; i<arr.length; i++) {
      if (arr[i] == element) {
        verdict = true;
        break;
      }
    }

    return verdict;
  }

  private static int findIdxOfEleInArray(int[] arr, int element) {
    int index = 0;

    for (int i=0; i<arr.length; i++) {
      if (arr[i] == element) {
        index = i;
        break;
      }
    }

    return index;
  }

  private static ArrayList<Integer> removeEleFromArray(int[] arr, int ele) {
    ArrayList<Integer> resArr = new ArrayList<>();
    for (int i = 0; i<arr.length; i++) {
      if (arr[i] != ele) {
        resArr.add(arr[i]);
      }
    }
    return resArr;
  }

  private static int[] reverseArray(int[] arr) {
    int len = arr.length;
    int[] rev = new int[len];

    for(int num:arr){
      len = len - 1;
      rev[len] = num;
    }

    return rev;
  }


  private static int[] findMinAndMax(int[] arr) {
    int max=0, min=0; max = arr[0]; min = arr[0];

    for (int num:arr) {
      if(num > max){
        max = num;
      } if(num < min){
        min = num;
      }
    }

    return (new int[]{min, max});
  }
}
