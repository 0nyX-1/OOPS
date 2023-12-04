// Encapsulation
/* It refers to providing controlled access to data members by preventing direct access.
*  Using setters and getters promotes data security and data hiding.
*  We are using getters and setters everywhere.
*
* A  class which has all private variables or data they are also called "bean" .
* */


package Encapsulation;
class Student {
    int age;     // instance variable , Data members , fields
    String name; // properties
    String city;

    private int age1;          // this is called bean since they all are private.
    private String name1;
    private String city1;
    private int clas;
    private int rollNo;
    private boolean marriage;
    private String lang;
    private String lang1;

    public String getLang1() {
        return lang1;
    }

    public void setLang1(String lang1) {
        this.lang1 = lang1;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        lang = lang;
    }

    void setAge(int a){     // setter  (setVariable)
        if(a>0){
        age1 = a;
        }
        else {
            System.out.println("invalid age");
        }

    }
    int getAge() {    // getter shouldn't accept any input.
        return age1;
    }
    void setName(String name){
        name1=name;
    }
    String getName(){
        return name1;
    }

    void setCity(String city){
        this.city1 = city;
    }

    String getCity(){
        return city1;
    }

    void setClas(int clas){
        clas=clas;

    }

    int getClas(){
        return clas;
    }

    void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }

    int getRollNo(){
        return rollNo;
    }

    /* Recommendation for boolean is to use isVariable */
    public boolean isMarried(){
        return marriage;
    }

}


public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        st.age=17;               // This method is not good !!!! Because other is using this.
        st.name="SOhan";          // There is no security since any can use.
        st.city="basundhara";     // To ensure this we have to use "private" keyword !s
         // st.age1; // cant access error!!

        int age;
        st.setAge(20);
        System.out.println(age = st.getAge());

        st.setName("sohan");
        System.out.println(st.getName());

        st.setClas(10);
        System.out.println("Your class is: "+st.getClas());

        /* The result is we get "0" for int and "null" for String because of Shadowing PROBLEM
        * To Solve this we need to add "this" keyword in class
        * */

        st.setRollNo(37);
        System.out.println(st.getRollNo());
        /* Here the problem is reduced because of the use of this keyword */

        System.out.println(st.isMarried());

        st.setCity("kathmandu");
        System.out.println(st.getCity());

        /* Since there is conflict we cannot assign same local variable to instance variable
        * So we must use this keyword to assign the running variable
        * "running variable means the instance variable */

        st.setLang("java");
        System.out.println(st.getLang());
        // this is the result with this keyword.
        // here we didn't get any null value.

        st.setLang1("Java");
        System.out.println(st.getLang1());

        System.out.println();

        // multiple objects


        Student student1 = new Student();
        student1.setRollNo(39);
        System.out.println(student1.getRollNo());

        student1.setCity("lalitpur");
        System.out.println(student1.getCity());

        student1.setLang("c++");
        System.out.println(student1.getLang());

        student1.setLang1("c++");
        System.out.println(student1.getLang1());
    }
}