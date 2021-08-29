package MockitoBasicExampleTest;

import MockitoBasicExample.MyDictionary;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class MyDictionaryTest {
    @Mock
   private  MyDictionary myDictionary;
    @Before
    public void setUp(){
        MyDictionary mydic = mock(MyDictionary.class);
        MyDictionary md=new MyDictionary();

    }
    //if method return type is not void,then we can use when then throw.
     @Test(expected = NullPointerException.class)
    public void nonVoidReturnTest(){
        when(myDictionary.getMeaning(anyString())).thenThrow(NullPointerException.class);
         myDictionary.getMeaning("word");
    }
   //if our method returns void, we'll use doThrow():
    @Test(expected = IllegalStateException.class)
    public void voidReturnTypeTest(){
        MyDictionary mydic = mock(MyDictionary.class);
     doThrow(IllegalStateException.class).when(mydic).add(anyString(),anyString());
        mydic.add("word","meaning");
    }
}
//when I am mocking like MyDictionary mydic = mock(MyDictionary.class); i am geeting the error when I am takeing
//refernce from out side.