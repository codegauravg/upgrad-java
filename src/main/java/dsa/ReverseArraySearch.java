package dsa;
import java.util.Scanner;

public class ReverseArraySearch {
    public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      //Declare the array here
      int count = input.nextInt();
      int[] array = new int[count];

      for (int i = 0; i < count; i++) {
        array[i] = input.nextInt();
      }
      int key = input.nextInt();
      input.close();
      //write your code here
      reverseSearch(count, array, key);

    }
    public static void reverseSearch(int count, int[] array, int key) {
      int revCount = 0;
      for (int i = count - 1; i >= 0; i--) {
        if (array[i] == key) {
          System.out.println(revCount);
          break;
        }
        revCount++;
      }
    }

}
