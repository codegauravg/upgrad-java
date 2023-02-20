package problems;

import java.util.Scanner;
public class PracticeQuestions2 {
  public static void main(String[] args) {

    //Create new scanner
    Scanner input = new Scanner(System.in);

    //Values of each digit
    int tenThousands, thousands, hundreds, tens, ones;

    //Prompt user to input 5 digit number

    int number = input.nextInt();
    if (number > 99999) {
      System.out.println("\nError! Number more than 5 digits.");
    }
    else if (number < 10000) {
      System.out.println("Error! Number less than 5 digits.");
    }
    else if (10000<=number&&number<=99999){
      //WRITE YOUR CODE HERE
      ones=(int) (number%Math.pow(10, 1));
      tens=(int) (number%Math.pow(10, 2));
      hundreds=(int) (number%Math.pow(10, 3));
      thousands=(int) (number%Math.pow(10, 4));
      tenThousands= (int) (number%Math.pow(10, 5));

      System.out.println(tenThousands);
      System.out.println(thousands);
      System.out.println(hundreds);
      System.out.println(tens);
      System.out.println(ones);
//      int inputNum = number;
//      while (inputNum > 0) {
//        int remainder = 0;
//        remainder = inputNum % 10;
//        inputNum = inputNum / 10;
//        System.out.println(remainder);
//      }
    }
  }
}
