package MockitoBasicExampleTest;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class spyPartialTest {
    @Test
    public void spyTest(){
        List<String> list=new ArrayList<String>();
        List<String> spyOnList=spy(list);
        when(spyOnList.size()).thenReturn(10);
        Assert.assertEquals(10,spyOnList.size());

        spyOnList.add("VenkataRao");
        spyOnList.add("Dharmesh");

        Assert.assertEquals("VenkataRao",spyOnList.get(0));
        Assert.assertEquals("Dharmesh",spyOnList.get(1));

    }
}
