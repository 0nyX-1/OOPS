package Injection.oneToOneAssociationMapping.Setter_Getter;

public class testApp {
    public static void main(String[] args) {
    Account acc1 = new Account();
        acc1.setName("SOhan");
        acc1.setAddress("Tokha");
        acc1.setWorkingBranch("Kathmandu");

    Employee employee = new Employee();
        employee.setEname("rahul");
        employee.setEbranch("Lalitpur");
        employee.setAddress("kathmandu");
        employee.setAcc(acc1);

        employee.getDetails();

    }


}
