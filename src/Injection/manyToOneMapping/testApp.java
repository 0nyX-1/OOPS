package Injection.manyToOneMapping;

public class testApp {
    public static void main(String[] args) {
        Branch branch = new Branch("Java Branch","01");

        Student student = new Student("Sohan","12 Class","Science",branch);
        Student student1 = new Student("Sohan","12 Class","law",branch);
        Student student2 = new Student("Rohan","12 Class","Mgmt",branch);

        Student[] students = new Student[3];
        students[0]=student;
        students[1]=student1;
        students[2]=student2;

        for (int i = 0; i < students.length; i++) {
            students[i].getDetails();
        }

    }
}
