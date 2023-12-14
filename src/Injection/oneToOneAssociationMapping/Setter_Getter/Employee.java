package Injection.oneToOneAssociationMapping.Setter_Getter;

public class Employee {
    private String ename;
    private String ebranch;
    private String address;

    Account acc;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEbranch() {
        return ebranch;
    }

    public void setEbranch(String ebranch) {
        this.ebranch = ebranch;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Account getAcc() {
        return acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }
    public void getDetails(){
        System.out.println("account details ::");
        System.out.println(acc.getName());
        System.out.println(acc.getAddress());
        System.out.println(acc.getWorkingBranch());
        System.out.println("==========================");
        System.out.println("Employee details");
        System.out.println("Employee branch::"+getEbranch());
        System.out.println("Employee address::"+getAddress());
        System.out.println("EMployee branch::"+getEbranch());
    }
}
