package hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

  @Test
  public void test1(){
    Calculator calculator = new Calculator();
    double value = calculator.calculate("50*2/5");
    assertEquals(20D, value);
  }
  
  // @Test
  // public void test2(){
  //  Calculator calculator = new Calculator();
  //  double value = calculator.calculate("15+5");
  //  assertEquals(10D, value);
  // }
}
