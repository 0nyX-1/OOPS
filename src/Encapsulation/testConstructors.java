package Encapsulation;

class Student1 {
    private String name;
    private String city;
    private int age;

    //constructors

    public Student1( String city, int age){
        // constructor doesnt have return keyword
        this(); //this keyword defaulty goes to constructor in same class with no parameter.
                // saying that it goes down below to one with no parameter in "Student1".
                // so since there is no name in this constructor it takes "rohan" from another constructor down below
                // but other variables are overridden by its own constructor declaration.

        // constructor chaining method process
        this.city=city;
        this.age = age;
    }
    //Constructor means specialized setter or method whose name is same of class name. Called during obj creating. No return statement
    /* Constructor overloading
    * Multiple method with same parameter is not allowed */

    Student1(){
        city="Kathmandu";
        age=17;
        name="rohan";
    }

    Student1(String name){
        this.name=name;
        city="Lalitpur";
        age=17;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }
}


public class testConstructors {
    public static void main(String[] args) {
        //calling constructors
        // creation of object involves calls to a construction
        /* IF NO CONSTRUCTOR IS in present in external class then there will be default constructor by jvm */
        // default constructor is 0 parameter.
        Student1 str = new Student1("Tokha", 18);
        System.out.println(str.getName()+ " "+ str.getAge()+" "+ str.getCity());

        Student1 str1 = new Student1();
        System.out.println(str1.getName()+" "+ str1.getAge()+" "+str1.getCity());

        /*Constructor overloading solutions */


        Student1 str2 = new Student1("mohan");
        System.out.println(str2.getName()+" "+ str2.getAge()+" "+str2.getCity());
    }
}
