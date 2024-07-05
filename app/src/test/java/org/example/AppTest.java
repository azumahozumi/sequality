package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

  private App app;

  @Before
  public void setUp() {
    app = new App();
  }

  @Test
  public void testGetGreeting() {
    assertEquals("Hello World!", app.getGreeting());
  }

  @Test
  public void testCalculateSumAndAverage() {
    // Test case 1: sum of 2 and 3
    assertEquals("Sum of 2 and 3 is 5. Average is 2.5.", getOutput(() -> app.calculateSumAndAverage(2, 3)));

    // Test case 2: sum of 0 and 0
    assertEquals("Sum of 0 and 0 is 0. Average is 0.0.", getOutput(() -> app.calculateSumAndAverage(0, 0)));

    // Add more test cases as needed
  }

  @Test
  public void testCalculateSumAndAverageFrom1ToN() {
    // Test case 1: sum from 1 to 10
    assertEquals("Sum of 1 to 10 is 55. Average is 5.5.", getOutput(() -> app.calculateSumAndAverageFrom1ToN(10)));

    // Test case 2: sum from 1 to 5
    assertEquals("Sum of 1 to 5 is 15. Average is 3.0.", getOutput(() -> app.calculateSumAndAverageFrom1ToN(5)));

    // Add more test cases as needed
  }

  @Test
  public void testCalculateSumOfOddAndEven() {
    // Test case 1: sum of odd and even numbers from 1 to 10
    assertEquals("Sum of odd of 1 to 10 is 25. Sum of even is 30.", getOutput(() -> app.calculateSumOfOddAndEven(10)));

    // Test case 2: sum of odd and even numbers from 1 to 5
    assertEquals("Sum of odd of 1 to 5 is 9. Sum of even is 6.", getOutput(() -> app.calculateSumOfOddAndEven(5)));

    // Add more test cases as needed
  }

  // Helper method to capture output of a method call
  private String getOutput(Runnable methodCall) {
    // Redirect System.out to capture output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outputStream));

    // Call the method
    methodCall.run();

    // Reset System.out
    System.setOut(originalOut);

    // Return captured output
    return outputStream.toString().trim();
  }
}
