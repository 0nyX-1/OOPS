package Injection.ManyToManyAssociation;

public class testApp {
    public static void main(String[] args) {
        Course course = new Course("Java",2500);
        Course course1 = new Course("Python",3500);
        Course course2 = new Course("c++",4500);

        Course[] courses = new Course[3];

        courses[0]=course;
        courses[1]=course1;
        courses[2]=course2;
        Student student = new Student("Sohan","Science",courses);
        Student student1 = new Student("Rohan","Law",courses);
        Student student2 = new Student("Mohan","Mgmt",courses);

        Student[] students = new Student[3];
        students[0]=student;
        students[1]=student1;
        students[2]=student2;

        for (int i = 0; i < students.length; i++) {
            students[i].getDetails();

        }
    }
}
