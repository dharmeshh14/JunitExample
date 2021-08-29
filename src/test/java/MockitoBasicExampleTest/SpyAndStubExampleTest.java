package MockitoBasicExampleTest;

import MockitoBasicExample.EmployeClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SpyAndStubExampleTest {

    List<String> comName;

    @InjectMocks
    EmployeClass employeClass;

    @BeforeEach
    public void setUp(){
        comName=new ArrayList<String>();
        comName.add("Nitesh");
        MockitoAnnotations.initMocks(this);

    }
    @Test
    public void simpleListTest(){
        //Dout when I mock the object then I am not geeting the issue but when I defining this in above
        // in setup then I am geeting the the null pointer exception.
        employeClass.setEmpNames(Arrays.asList("Nitesh"));
        when(employeClass.getEmpNames()).thenReturn(Arrays.asList("Nitesh"));
        List<String> result=employeClass.getEmpNames();
        //System.out.println(comName.get(0));
        //when(comName.size()).thenReturn(1);
      // Assert.assertEquals("Epam Systems",comName.get(0));
      //Assert.assertEquals("Epam Systems",employeClass.getEmpNames().get(0));
       Assert.assertEquals("Nitesh",result.get(0));
       // comName.add(1,"TR");
       // System.out.println(comName.get(1));
    }
}
