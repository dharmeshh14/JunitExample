import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeBusiness {

    public double calculateYerlySallry(Employee employeedtl){
        double yearlySalary = 0;
        yearlySalary=employeedtl.getSalary()*12;
        return yearlySalary;
    }
    public double caculateAppraisal(Employee employeedtl){
        double appraisal=0;
        if(employeedtl.getSalary()<10000){
            appraisal=500;
        }
        else{
            appraisal=1000;
        }
        return appraisal;
    }
    public void allEmployee(List<Employee> employee){
        for (Employee s : employee) //Iterates as long as there are elements in the list. An object s is created of type Employee class.
        {
            System.out.print("ID, Name and City of the employee are : ");
            System.out.println(s.getId()+" "+s.getName()+" " +s.getSalary()+""+s.getDateOfJng()+" "+s.getDepartment());
        }
    }
    //Sort All employee by name in reverse order
    public void reverseOrder(List<Employee> employees){

        Comparator<Employee> comparator=Comparator.comparing(e->e.getName());
        employees.sort(comparator.reversed());
    }
}
