import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeBusinessTest {
    EmployeeBusiness employeeBusiness=new EmployeeBusiness();
    Employee employee=new Employee();
    @Test
    public void caculateAppraisalTest(){
        employee.setName("John");
        employee.setSalary(9000);
        employee.setDepartment("Programmer");
        employee.setId(67);
        double appraisal=employeeBusiness.caculateAppraisal(employee);
        assertEquals(500,appraisal,0.0);
    }

}
