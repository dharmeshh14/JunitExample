import java.util.HashSet;
import java.util.Set;

public class SetJunitExample {
    private Set<String> emp=new HashSet<String>();

    public void removeEmp(String name){
        emp.remove(name);
    }
    public void addEmp(String name){
        emp.add(name);
    }
    public void removeAllEmp(){
        emp.clear();
    }
    public int sizeOfEmpSet() {
        return emp.size();
    }
}
