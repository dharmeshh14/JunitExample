package MockitoAddingBehbiour;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationVarifyingBehaviourTest {
    @InjectMocks
    MathApplication mathApplication=new MathApplication();
    @Mock
    CalculatorService calculatorService;

    @Test
    public void addTest(){
        when(calculatorService.add(10.0,20.0)).thenReturn(30.0);
        Assert.assertEquals(calculatorService.add(10.0,20.0),30.0,0);
        verify(calculatorService).add(20.0,20.0);
    }
    @Test(expected = RuntimeException.class)
    //@Test
    public void testAdd(){

        doThrow(new RuntimeException("Add operation not implemented"))
                .when(calculatorService).add(10.0,20.0);


        Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
    }
}
