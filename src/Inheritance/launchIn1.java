package Inheritance;
class Demo{
    private String name;
    private int age;

    Demo(String name, int age){
        this.name=name;
        this.age=age;
    }
    void disp(){
        System.out.println("My name is: "+name+" and my age is: "+age);
    }
    private void disp2(){

    }
}

class Demo1 extends Demo{
    Demo1(String name, int age) {

        super(name, age);
    }


}

public class launchIn1 {
    public static void main(String[] args) {
    Demo1 d1 = new Demo1("Sohan",17);
        d1.disp();

    }

}
