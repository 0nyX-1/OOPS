package Injection.oneToOneAssociationMapping.Constructor;

public class testApp {
    public static void main(String[] args) {
        Account acc = new Account("Sohan",001,"Savings");

        //construcyor injection
        Employee employee = new Employee("Rahul",1,"Kathmandu",acc);
        employee.getDetails();
    }
}
