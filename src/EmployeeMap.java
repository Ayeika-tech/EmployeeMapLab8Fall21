import java.util.HashMap;

public class EmployeeMap {

    // create a hashmap to add employee objects to store key and values
    private HashMap<Integer, Employee> myMap = new HashMap<Integer, Employee>();

    // use addEmp to link employee and their ids into the hashmap
    public void addEmp(Employee e) {
        myMap.put(e.getIdNumber(), e);
    }

    // searchEmp search for the value of an Employee object using the unique ID
    // number
    // If not found then print is not found.
    public Employee searchEmp(int id) {
        if (!myMap.containsKey(id)) {
            System.out.println("Value for the key: " + id + " is not found:");
        }
        return myMap.get(id);

    }
}