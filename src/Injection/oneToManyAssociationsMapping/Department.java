package Injection.oneToManyAssociationsMapping;

public class Department {
    private String departmentName;
    private String Address;
    private String Value;

    private Employee[] employees;

    Department(String departmentName,String Address, String Value, Employee[] employees){
        this.departmentName=departmentName;
        this.Address=Address;
        this.Value=Value;
        this.employees=employees;

    }
        public void getDetails(){
            System.out.println("department Details ::");
            System.out.println("Department's name:: "+departmentName);
            System.out.println("Department's Address:: "+Address);
            System.out.println("Department's Value:: "+Value);
            System.out.println("employee details are::");
            for (Employee employee: employees) {
                System.out.println("Employee Name::"+employee.ename);
                System.out.println("Employee Address::"+employee.eaddr);
                System.out.println("Employee Id::"+employee.eid);
                System.out.println("========================================");

            }

    }
}
