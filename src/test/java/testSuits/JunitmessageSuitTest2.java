package testSuits;

import org.junit.Assert;
import org.junit.Test;

public class JunitmessageSuitTest2 {

    @Test
    public void messagecheck(){
        String expct="Epam";
        String res="Epam";
        Assert.assertEquals(expct,res);
        System.out.println("suittest 2 is succesfully run");
    }
}
