import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDeatailsMain {


    public static void main(String[] args){
        Employee e1=new Employee(1,"john",500.00,"1998-01-27","Cahier");
        Employee e2=new Employee(2,"john",5000.00,"1999-03-27","NONIT");
        Employee e3=new Employee(3,"john",5007.00,"1998-01-27","IT");
        Employee e4=new Employee(4,"john",5009.00,"1996-07-27","NONIT");
        Employee e5=new Employee(5,"john",5008.00,"1998-07-27","IT");
        List<Employee> listEmployee=new ArrayList<Employee>();

        listEmployee.add(e1);
        listEmployee.add(e2);
        listEmployee.add(e3);
        listEmployee.add(e4);
        listEmployee.add(e5);
        EmployeeBusiness employeeBusiness=new EmployeeBusiness();
        employeeBusiness.allEmployee(listEmployee);

      Result result= JUnitCore.runClasses();
      for(Failure faiulure : result.getFailures()){
          System.out.println(faiulure.toString());
      }
        System.out.println(result.wasSuccessful());
    }
}
