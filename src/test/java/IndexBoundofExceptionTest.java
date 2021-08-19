import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class IndexBoundofExceptionTest {
    IndexBoundofException inb=new IndexBoundofException();
    String[] schoolbag = { "Books", "Notebooks", "Pens" };

    @Test
    public void indexBoundOfExceptionTest(){
      System.out.println("Inside indexBoundOfExceptionTest");
        assertArrayEquals(schoolbag,inb.prepareMyBag());

        assertEquals(3, schoolbag.length);

    }
   // @Test(expected = ArrayIndexOutOfBoundsException.class)
    @Test
    public void PrintItemsTest() {
        System.out.println("Inside printItems()");
        inb.printItems(schoolbag);
    }

}
