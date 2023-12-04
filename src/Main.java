// Encapsulation
/* It refers to providing controlled access to data members by preventing direct access.
*  Using setters and getters promotes data security and data hiding.
*  We are using getters and setters everywhere.
*
* A  class which has all private variables or data they are also called "bean" .
* */


class Student {
    int age;     // instance variable , Data members , fields
    String name; // properties
    String city;

    private int age1;          // this is called bean since they all are private.
    private String name1;
    private String city1;
    private int clas;
    private int rollNo;

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
        city1 = city;
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
    int name2;

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

        /* The result is we get "0" for int and "null" for String because of SHadowing PROBLEM
        * To Solve this we need to add "this" keyword in class
        * */

        st.setRollNo(37);
        System.out.println(st.getRollNo());
        /* Here the problem is reduced because of the use of this keyword */
    }
}