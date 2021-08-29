package MockitoBasicExampleTest;

import MockitoBasicExample.MaximumNumber;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MaximumNumberTest {
    @Mock
    MaximumNumber maximumNumber;
    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        MaximumNumber mx=new MaximumNumber();
    }
    @Test
    public void getMaximumNumberTest(){
        when(maximumNumber.getMaximumNumber(new int[]{34,6,7,87,57})).thenReturn(87);
        Assert.assertEquals(maximumNumber.getMaximumNumber(new int[]{34,6,7,87,57}),87);
        verify(maximumNumber).getMaximumNumber(new int[]{45,67,23,78});

        //verify(calculatorService).add(20.0,20.0);
    }
}
