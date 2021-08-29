package MockitoBasicExampleTest;

import MockitoBasicExample.EvenNumber;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

public class EvenNumberTest {
//if you use the @Mock annotation you must trigger the initailization of the annotation field.

    @InjectMocks
    private EvenNumber evenNumber1;
    @Before
    public void setUp(){
     MockitoAnnotations.initMocks(this);
    }

    @Test
    public void isEvenNumberTest(){
        //Given
        int number=7;
      //  when(evenNumber.isEvenNumber(anyInt())).thenReturn(true);
        //When
        boolean result= evenNumber1.isEvenNumber(number);
        //Then
        Assert.assertEquals(true,result);
    }

}
