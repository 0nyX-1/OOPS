package Injection.oneToManyAssociationsMapping;

public class testApp {
    public static void main(String[] args) {
        int count=0;
        Employee em = new Employee("Sohan",1,"Kathmandu");
        Employee em1 = new Employee("Mohan",2,"Lalitpur");
        Employee em2 = new Employee("Gohan",3,"Bhaktapur");

        Employee[] emps = new Employee[3];
        emps[0]=em;
        emps[1]=em1;
        emps[2]=em2;

        Department department = new Department("Sohan sales","Kathmandu","10Crore",emps);
        department.getDetails();

    }

}
