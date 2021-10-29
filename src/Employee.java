public class Employee {
    //add id and name for employees
    private int idNumber;
    private String name;

    //coonstructor
    public Employee(int id, String n) {
        this.idNumber = id;
        this.name = n;
    }

    //getters and setters
    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int i) {
        idNumber = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    // toString in case I want to see an employees info
    @Override
    public String toString() {
        return "Employee idNumber=" + idNumber + ", name= " + name ;
    }
}
