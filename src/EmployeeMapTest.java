public class EmployeeMapTest {

    //why toString on Employee keeps returning wrong number
    public static void main(String[] args) {

        // create an object for EmployeeMap class
        EmployeeMap map = new EmployeeMap();

        // create employee objects with different IDs
        Employee e1 = new Employee(75033, "Lucas Brown");
        Employee e2 = new Employee(73100, "Zach Whitehood");
        Employee e3 = new Employee(75248, "Dallas Hazleton");

        // add those employee objects to the hashmap
        map.addEmp(e1);
        map.addEmp(e2);
        map.addEmp(e3);

        // print the name attached to the IdNumber
        System.out.println("Testing working keys:");
        System.out.println(map.searchEmp(e1.getIdNumber()).getName());
        System.out.println(map.searchEmp(e2.getIdNumber()).getName());
        System.out.println(map.searchEmp(e3.getIdNumber()).getName());
        System.out.println("Testing a key that is not found");
        System.out.println(map.searchEmp(75555).getName());

    }
}
