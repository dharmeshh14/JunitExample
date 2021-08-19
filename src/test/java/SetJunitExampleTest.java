import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetJunitExampleTest {
    SetJunitExample obj=new SetJunitExample();
    @Test
    public void addEmpTest(){
        obj.addEmp("Krshna");
        obj.addEmp("Dhiraj");
        obj.addEmp("VenkataRao");
        obj.addEmp("Dinesh");
        assertEquals("Adding 4 Employee to list", 4, obj.sizeOfEmpSet());
    }
    @Test
    public void removeAllEmpTest(){
        obj.addEmp("Antonio");
        obj.addEmp("Krishna");
        obj.removeEmp("Krishna");
        assertEquals("Removing 1 student from list", 1, obj.sizeOfEmpSet());
    }
    @Test
    public void removeAllTest() {
        obj.removeAllEmp();
    }
}
