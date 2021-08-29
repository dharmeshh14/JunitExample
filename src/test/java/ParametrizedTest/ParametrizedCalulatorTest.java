package ParametrizedTest;

import Paramaterized.ParametrizedCalulator;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParametrizedCalulatorTest {
    private int a;
    private int b;
    private int expected;
    private ParametrizedCalulator parametrizedCalulator;
  public ParametrizedCalulatorTest(int a,int b,int expected){
      super();
      this.a=a;
      this.b=b;
      this.expected=expected;
  }

  @BeforeEach
    public void initialize(){
      parametrizedCalulator=new ParametrizedCalulator();
  }
  @Parameterized.Parameters
  public static List<Object[]> input(){
    return Arrays.asList(new Object[][]{{1,3,4},{11,22,33},{11,122,133}});
  }
  @Test(expected = NullPointerException.class)
    public void paramaterizedCalculatorTest(){
      System.out.println("Sum of Number:"+expected);
      assertEquals(expected,parametrizedCalulator.sumOfTwoNumber(a,b));
  }
}

