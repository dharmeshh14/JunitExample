package MockitoBasicExample;

import java.util.List;

public class EmployeClass {
    private List<String> empNames;

    public EmployeClass(List<String> empNames) {
        this.empNames = empNames;
    }

    public EmployeClass() {
        super();
    }

    public List<String> getEmpNames() {
        return empNames;
    }

    public void setEmpNames(List<String> empNames) {
        this.empNames = empNames;
    }
}
