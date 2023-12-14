package Injection.ManyToManyAssociation;

public class Student {
    private String name;
    private String stream;

    Course[] courses;

    public Student(String name, String stream, Course[] courses) {
        this.name = name;
        this.stream = stream;
        this.courses = courses;
    }

    public void getDetails(){

        System.out.println("----------------------------------------------------------");
        System.out.println("Student details :: ");
        System.out.println("Student name :: "+ name);
        System.out.println("Student Stream :: "+stream);
        System.out.println("----------------------------------------------------------");
        for(int i=0;i< courses.length;i++){
            System.out.println("Course taken by student");
            System.out.println("Course name :: "+courses[i].courseName);
            System.out.println("Course value :: "+courses[i].Value);
            System.out.println("=======================================");
        }
    }
}
