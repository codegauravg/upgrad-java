package learnQuestions;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class FindMean {
  public static void main(String args[]) throws FileNotFoundException {
    File inputFile = new File("/Users/ggunjan/Documents/Study/MScCS/Projects/upgrad-java/src/learnQuestions/quiz_numbers.txt");

    Scanner scan = new Scanner(inputFile);

    int count = 0;
    int sum = 0;

    while (scan.hasNext()) {  // read the numbers and add them to the value of the sum
      int number = scan.nextInt();
      sum = sum + number;
      count++;
      System.out.println("Number|Sum is : " + count + ":" + number + "|" + sum);
    }

    double mean = (double) sum/count;

    System.out.println("Mean is : " + mean);

  }
}
