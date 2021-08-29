package MockitoBasicExampleTest;

import MockitoBasicExample.MathAdd;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SpyAnotationTest {
    @Spy
    MathAdd mathAdd;
    @InjectMocks
    MathAdd mathAdd1;

    private MathAdd md;

    @BeforeEach
    public void setUp(){
       MockitoAnnotations.initMocks(this);
       // MathAdd md=new MathAdd();
        MathAdd md=mock(MathAdd.class);
    }
    @Test
    public void calculateSumTest(){
        MathAdd md=mock(MathAdd.class);
        when(md.calculateSum(2,2)).thenReturn(4);
        assertEquals(20, md.calculateSum(19, 1));
    }
}
