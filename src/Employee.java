public class Employee {
    private int idNumber;
    private String name;

    public Employee(int id, String n) {
        this.idNumber = id;
        this.name = n;
    }

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

    @Override
    public String toString() {
        return "Employee idNumber=" + idNumber + ", name= " + name ;
    }

}
