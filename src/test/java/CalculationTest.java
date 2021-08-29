import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculationTest {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        System.out.println("Before class");
    }
    @Before
    public void setUp()throws Exception{
        System.out.println("Before");
    }
    @Test
    public void findMaxTest(){
        System.out.println("Test Case For Find Max");
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
        assertEquals(-1,Calculation.findMax(new int[]{-1,-3,-4,-2}));
    }
    @Test
    public void reverseWordTest(){
        System.out.println("Test Case for Find Reverse");
        assertEquals("ylimaF sselfleS",Calculation.reverseWord("Selfless Family"));
    }
    @Test
    public void cubeTest(){
        assertEquals(27,Calculation.cube(3));
    }
    @After
    public void tearDown() throws Exception{
        System.out.println("After");
    }
    @AfterClass
    public static void tearDownAfterClass()throws Exception{
        System.out.println("After class");
    }
}
