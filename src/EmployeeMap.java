import java.util.HashMap;

public class EmployeeMap {

    // create a hashmap to add employee objects to store key and values
    private HashMap<Integer, Employee> myMap = new HashMap<Integer, Employee>();

    public void addEmp(Employee e) {
        myMap.put(e.getIdNumber(), e);
    }

    public Employee searchEmp(int id) {

        return myMap.get(id);
    }

}
