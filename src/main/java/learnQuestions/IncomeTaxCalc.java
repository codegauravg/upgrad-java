package learnQuestions;

import java.util.Scanner;

public class IncomeTaxCalc {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      // Enter annual income
      double income = scan.nextDouble();
      // Enter age
      int age = scan.nextInt();

      double tax = 0.0;
      double taxableIncome = income;
      double taxedIncome = 0.0;
      // Write your logic here
      if (age >= 80) {
        if (taxableIncome > 1000000.0) {
          taxedIncome = taxableIncome - 1000000.0;
          tax = tax + (0.3 * taxedIncome);
          taxableIncome = taxableIncome - taxedIncome;
        }
        if (taxableIncome > 500000.0 && taxableIncome <= 1000000.0) {
          taxedIncome = taxableIncome - 500000.0;
          tax = tax + (0.2 * taxedIncome);
          taxableIncome = taxableIncome - taxedIncome;
        }
        if (taxableIncome > 0.0 && taxableIncome <= 500000.0) {
          tax = tax + 0.0;
        }
      } else if (age >= 60 && age < 80) {
        if (taxableIncome > 1000000.0) {
          taxedIncome = taxableIncome - 1000000.0;
          tax = tax + (0.3 * taxedIncome);
          taxableIncome = taxableIncome - taxedIncome;
        }
        if (taxableIncome > 500000.0 && taxableIncome <= 1000000.0) {
          taxedIncome = taxableIncome - 500000.0;
          tax = tax + (0.2 * taxedIncome);
          taxableIncome = taxableIncome - taxedIncome;
        }
        if (taxableIncome > 300000.0 && taxableIncome <= 500000.0) {
          taxedIncome = taxableIncome - 300000.0;
          tax = tax + (0.1 * taxedIncome);
          taxableIncome = taxableIncome - taxedIncome;
        }
        if (taxableIncome > 0.0 && taxableIncome <= 300000.0) {
          tax = tax + 0.0;
        }
      } else {
        if (taxableIncome > 1000000.0) {
          taxedIncome = taxableIncome - 1000000.0;
          tax = tax + (0.3 * taxedIncome);
          taxableIncome = taxableIncome - taxedIncome;
        }
        if (taxableIncome > 500000.0 && taxableIncome <= 1000000.0) {
          taxedIncome = taxableIncome - 500000.0;
          tax = tax + (0.2 * taxedIncome);
          taxableIncome = taxableIncome - taxedIncome;
        }
        if (taxableIncome > 300000.0 && taxableIncome <= 500000.0) {
          taxedIncome = taxableIncome - 300000.0;
          tax = tax + (0.1 * taxedIncome);
          taxableIncome = taxableIncome - taxedIncome;
        }
        if (taxableIncome > 250000.0 && taxableIncome <= 300000.0) {
          taxedIncome = taxableIncome - 250000.0;
          tax = tax + (0.1 * taxedIncome);
          taxableIncome = taxableIncome - taxedIncome;
        }
        if (taxableIncome > 0.0 && taxableIncome <= 250000.0) {
          tax = tax + 0.0;
        }
      }

      System.out.print(tax);
      scan.close();
    }
}
