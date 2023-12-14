package polymorphism;

class parent {
    void behaviour(){
        System.out.println("Friendly");
    }
}
class child1 extends parent{
    void cigaratee(){
        System.out.println("Child is a chainsmoker");
    }

    @Override
    void behaviour() {
        System.out.println("Furious");
    }
}
class call{
    void permit(parent Parent){
        Parent.behaviour();

    }
}

public class launchParent {

    public static void main(String[] args) {
        parent p = new parent();
        parent c1 = new child1();
        call c = new call();
        c.permit(c1);
        c.permit(p);
        ((child1) c1).cigaratee();

    }
}
