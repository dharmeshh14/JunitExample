package testSuits;

import org.junit.Test;
import testsuits.JunitMessage;

public class JunitMessageSuitTest1 {
    public String message="Good Morning";
    JunitMessage jm=new JunitMessage(message);
    @Test(expected = ArithmeticException.class)
    public void junitmessageTest(){
        System.out.println("Junit mesaage is printing");
        jm.printMessage();
    }
    @Test
    public void junitmessageHitest(){
        System.out.println("Print the message with Hi");
        jm.printHiMessage();
    }
}
