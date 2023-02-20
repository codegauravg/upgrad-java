package learnQuestions;

import java.util.*;
public class celToFahr {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int cel = input.nextInt();
      float f = (9 * (float)cel)/5 + 32;

      System.out.println(f);
  }
}
