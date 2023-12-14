package Injection.oneToManyAssociationsMapping;

import Injection.oneToOneAssociationMapping.Constructor.Account;

public class Employee {
    String ename;
    int eid;
    String eaddr;

    //Has-A relationship
    Account account;

    public Employee(String ename, int eid, String eaddr) {
        this.ename = ename;
        this.eid = eid;
        this.eaddr = eaddr;
    }


}
