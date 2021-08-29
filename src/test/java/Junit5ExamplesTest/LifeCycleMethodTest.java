package Junit5ExamplesTest;


import Junit5Examples.CalculatorAdd;
import org.junit.jupiter.api.*;

/*
@BeforeEach:-The annotated method will run before each Test method in the test class
@BeforeAll:-The annotated method will be run before all test methods in the test class.
 This method must be static.
@AfterEach:-The annotated method will run after each Test method in the test class
@AfterAll:-The annotated method will be run after all test methods in the test class.
This method must be static.
@Disable:-It is used to Disable or ignore a test class or method from test Suit.
@Tag:-Mark test methods or test classes with tags for test discovering and filtering

 */
public class LifeCycleMethodTest {
    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }

    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }

    @Tag("DEV")
    @Test
    void calcOneTest()
    {
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals( 4 , CalculatorAdd.addMethod(2, 2));
    }

    @Tag("PROD")
    @Disabled
    @Test
    void calcTwoTest()
    {
        System.out.println("======TEST TWO EXECUTED=======");
        Assertions.assertEquals( 6 , CalculatorAdd.addMethod(2, 4));
    }

    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }

    @AfterAll
    static void tear(){
        System.out.println("@AfterAll executed");
    }
}
