package Injection.oneToOneAssociationMapping.Constructor;


//Dependent Object
public class Account {
    private String accName;
    private int accno;
    private String accType;

    public Account(String accName, int accno, String accType) {
        this.accName = accName;
        this.accno = accno;
        this.accType = accType;
    }

    public String getAccName() {
        return accName;
    }

    public int getAccno() {
        return accno;
    }

    public String getAccType() {
        return accType;
    }
}
