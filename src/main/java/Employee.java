import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String dateOfJng;
    private String Department;

    public Employee() {
        super();
    }

    public Employee(int id, String name, double salary, String dateOfJng, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dateOfJng = dateOfJng;
        Department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDateOfJng() {
        return dateOfJng;
    }

    public void setDateOfJng(String dateOfJng) {
        this.dateOfJng = dateOfJng;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dateOfJng=" + dateOfJng +
                ", Department='" + Department + '\'' +
                '}';
    }
}
