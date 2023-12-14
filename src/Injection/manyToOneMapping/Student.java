package Injection.manyToOneMapping;

public class Student {
    private String sname;
    private String sclass;
    private String stream;

    Branch branch;

    public Student(String sname, String sclass, String stream, Branch branch) {
        this.sname = sname;
        this.sclass = sclass;
        this.stream = stream;
        this.branch = branch;
    }

    public void getDetails(){
        System.out.println("Student details :: ");
        System.out.println("Student name :: "+sname);
        System.out.println("Student class :: "+sclass);
        System.out.println("Student stream :: "+stream);
        System.out.println("==============================");
        System.out.println("Branch details :: ");
        System.out.println("Branch name :: "+branch.bname);
        System.out.println("Branch number :: "+branch.bnumber);
        System.out.println("==============================");
        System.out.println("==============================");

    }
}
