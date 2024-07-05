package org.example;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

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
  public void testCalculateSum_Average() {
    assertEquals("Sum of 2 and 3 is 5. Average is 2.5.", getOutput(() -> app.calculateSum_Average(2, 3)));
    assertEquals("Sum of 0 and 0 is 0. Average is 0.0.", getOutput(() -> app.calculateSum_Average(0, 0)));
  }

  @Test
  public void testCalculateSum_Average_n() {
    assertEquals("Sum of 1 to 10 is 55. Average is 5.5.", getOutput(() -> app.calculateSum_Average_n(10)));
    assertEquals("Sum of 1 to 5 is 15. Average is 3.0.", getOutput(() -> app.calculateSum_Average_n(5)));
  }

  @Test
  public void testCalculateSumOdd_Even() {
    assertEquals("Sum of odd of 1 to 10 is 25. Sum of even is 30.", getOutput(() -> app.calculateSumOdd_Even(10)));
    assertEquals("Sum of odd of 1 to 5 is 9. Sum of even is 6.", getOutput(() -> app.calculateSumOdd_Even(5)));
  }

  private String getOutput(Runnable methodCall) {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    try {
      System.setOut(new PrintStream(outputStream));
      methodCall.run();
      return outputStream.toString().trim();
    } finally {
      System.setOut(originalOut);
    }
  }
}
