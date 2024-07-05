package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void testAppReternHelloWorld() {
    App classUnderTest = new App();
    assertEquals("Hello World!", classUnderTest.getGreeting());
  }

  @Test
  public void testCalculateSumAndAverage() {
    App classUnderTest = new App();
    classUnderTest.calculateSumAndAverage(2, 3);
    // Add assertions here if needed
  }

  @Test
  public void testCalculateSumAndAverageFrom1ToN() {
    App classUnderTest = new App();
    classUnderTest.calculateSumAndAverageFrom1ToN(10);
    // Add assertions here if needed
  }

  @Test
  public void testCalculateSumOfOddAndEven() {
    App classUnderTest = new App();
    classUnderTest.calculateSumOfOddAndEven(10);
    // Add assertions here if needed
  }
}
