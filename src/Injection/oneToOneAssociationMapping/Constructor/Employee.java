package Injection.oneToOneAssociationMapping.Constructor;

public class Employee {
    private String ename;
    private int eid;
    private String eaddr;

    //Has-A relationship
    Account account;

    public Employee(String ename, int eid, String eaddr, Account account) {
        this.ename = ename;
        this.eid = eid;
        this.eaddr = eaddr;
        this.account = account;
    }
    public void getDetails(){
        System.out.println("Employee details are ::");
        System.out.println("Employee name :: "+ename);
        System.out.println("Employee id :: "+eid);
        System.out.println("Employee address :: "+eaddr);
        System.out.println("Account details :: ");
        System.out.println("Account name :: "+account.getAccName());
        System.out.println("Account ID :: "+account.getAccno());
        System.out.println("Account type :: "+account.getAccType());
    }
}
