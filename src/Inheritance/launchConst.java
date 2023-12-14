package Inheritance;

class Parent{
    int x,y;
    Parent(){
        this(111,222);

        System.out.println("0 parameterized");
    }
    Parent(int x, int y){
        this.x=x;
        this.y=y;
    }
    void disp2(){

    }
}
class Child extends Parent{
    int a,b;

    Child(int a, int b){
        this.a=a;
        this.b=b;
    }
    void disp(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }

}

public class launchConst {
    public static void main(String[] args) {
        Child c = new Child(30,40);
        c.disp();
    }
}
