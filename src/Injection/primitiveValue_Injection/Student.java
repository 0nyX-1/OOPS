package Injection.primitiveValue_Injection;

public class Student {
    private String name;
    private int sid;
    private int age;

    public Student(String name, int sid, int age) {
        this.name = name;
        this.sid = sid;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sid=" + sid +
                ", age=" + age +
                '}';
    }
}
