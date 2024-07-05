package org.example;

public class App {

  private Calculate calculator;

  public App() {
    this.calculator = new Calculate();
  }

  public String getGreeting() {
    return "Hello World!";
  }

  public void calculateSumAndAverage(int x, int y) {
    int sum = calculator.sum(x, y);
    double average = (double) sum / 2;
    System.out.printf("Sum of %d and %d is %d. Average is %.1f.%n", x, y, sum, average);
  }

  public void calculateSumAndAverageFrom1ToN(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    double average = (double) sum / n;
    System.out.printf("Sum of 1 to %d is %d. Average is %.1f.%n", n, sum, average);
  }

  public void calculateSumOfOddAndEven(int n) {
    int sumOdd = 0;
    int sumEven = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 1) {
        sumOdd += i;
      } else {
        sumEven += i;
      }
    }
    System.out.printf("Sum of odd of 1 to %d is %d. Sum of even is %d.%n", n, sumOdd, sumEven);
  }
}
