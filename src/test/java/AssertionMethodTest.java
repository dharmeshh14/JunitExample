import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertSame;

public class AssertionMethodTest {

    @Test
    public void assertionTest(){
        String s1=new String("Thomsaon");
        String s2=new String("Thomsaon");
        String s3="Thomsaon";
        String s4="Thomsaon";
        String s5=null;
        int val1=10;
        int val=20;
        String[] expectedArray={"one","two","three"};
        String[] resultArray={"one","two","three"};
        int[] intExpectedArray={1,3,4};
        int[] intResultArray={1,3,4};

       // assertArrayEquals(expectedArray,resultArray);
       assertEquals(s1,s2);
       assertTrue(val1<val);
       assertFalse(val1>val);
       assertNotNull(s1);
       assertNull(s5);
       assertNotSame(s1,s2);
       assertSame(s3,s4);
    }
    @Test
    public void assertionArrayTest(){
        String[] expectedArray1={"one","two","three"};
        String[] resultArray1={"one","two","three"};
        int[] intExpectedArray={1,3,4};
        int[] intResultArray={1,3,4};
        assertArrayEquals("both Array is same",expectedArray1,resultArray1);
        assertArrayEquals("both Array is same",intExpectedArray,intResultArray);
    }

}
