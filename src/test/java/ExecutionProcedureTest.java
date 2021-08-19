import org.junit.*;

public class ExecutionProcedureTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("I am in before class");

    }
    @AfterClass
    public static void afterClass(){
        System.out.println("I am in After class");

    }
    @Before
    public void before(){
        System.out.println("I am in before");
    }
    @After
    public void after() {
        System.out.println("in after");
    }

    @Test
    public void testCase1() {
        System.out.println("in test case 1");
    }

    //test case 2
    @Test
    public void testCase2() {
        System.out.println("in test case 2");
    }
}
