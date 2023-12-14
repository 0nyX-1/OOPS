package Encapsulation.simpleInterest;
class Farmer{
    private float pa;
    private float si;
    private float td;
    private static float roi;


    static{
        roi=8f;
    }

    public float getPa() {
        return pa;
    }

    public void setPa(float pa) {
        this.pa = pa;
    }


    public float getTd() {
        return td;
    }

    public void setTd(float td) {
        this.td = td;
    }



    float calculateLoan(){
        si = (pa*td*roi)/100;
        return si;
    }
    void display(){
        System.out.println(si);
    }
}


public class launchLoan {
    public static void main(String[] args) {
        Farmer f1 = new Farmer();
        f1.setPa(1000f);
        f1.setTd(6f);
        f1.calculateLoan();
        f1.display();

        Farmer f2 = new Farmer();
        f2.setPa(3000);
        f2.setTd(10);
        f2.calculateLoan();
        f2.display();
    }
}
