public class EmployeeMapTest {


    //why toString on Employee keeps returning wrong number
    public static void main(String[] args) {

        // create an object for EmployeeMap class
        EmployeeMap map = new EmployeeMap();

        // create employee objects with different IDs
        Employee e1 = new Employee(00731, "Lucas Brown");
        Employee e2 = new Employee(18201, "Zach Whitehood");
        Employee e3 = new Employee(75248, "Dallas Hazleton");
        // add those employee objects to the hashmap
        map.addEmp(e1);
        map.addEmp(e2);
        map.addEmp(e3);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        // print the name attached to the IdNumber
        System.out.println(map.searchEmp(75248).getName());
        System.out.println(map.searchEmp(00731).getName());
        System.out.println(map.searchEmp(18201).getName());

    }

}
