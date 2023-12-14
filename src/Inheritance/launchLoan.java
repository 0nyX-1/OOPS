package Inheritance;

import java.awt.*;
import java.util.Scanner;

class Loan{
    private int pa;
    private int time;
    private int roi;
    private int si;
    int SI;


    public Loan(){

    }

    public Loan(int pa, int roi, int time){
        this.pa=pa;
        this.roi=roi;
        this.time=time;

    }
    private int calculateSI(){
        si=(pa*time*roi)/100;
        return si;
    }
    public void disp(){
        SI=calculateSI();
        System.out.println("Your simple interest after "+time+" years will be "+SI+" rupees");
    }
    public void Purpose(){

        System.out.println("What is the purpose for your Loan");
    }
    public String inputString(){
        String inputDecision;
        Scanner scc =new Scanner(System.in);
        inputDecision = scc.next();
        return inputDecision;
    }
    public boolean inputBoolean(){
        boolean inputDecision;
        Scanner scc =new Scanner(System.in);
        inputDecision = scc.nextBoolean();
        return inputDecision;
    }
}

class personalLoan extends Loan{
    private static int roi;
    private String Daraz;
    private int costDaraz;
    private String Bed;
    private int costBed;
    private int HOP;

    static {
        personalLoan.roi = 10;
    }

    personalLoan(int pa, int time){
        super(pa,roi,time);
    }

    @Override
    public void Purpose() {
        System.out.println();
        super.Purpose();
        System.out.println("The purpose is to buy some mortgages for my house");
    }
    void homeImprovementProject(){

        boolean agree =false;
        String color;
        System.out.println("Do you want to buy Daraz? \n true/false");
        agree=inputBoolean();
        if(agree==true){
            int costOfMaintain;
            int initialCost;
            boolean finalDecision=false;
            System.out.println("What color do you want? \n"+ " We have in different variations!");
            color=inputString();
            switch(color){
                case "black":
                    System.out.println("Wow Black ? Interesting choice of color!!");
                    costOfMaintain=1000;
                    System.out.println("Because of color black our maintainance cost became higher");
                    initialCost=10000;
                    System.out.println("The final cost becomes "+(initialCost+costOfMaintain));
                    System.out.println("Do you wanna take or no ? \n true/false");
                    finalDecision=inputBoolean();
                    if(finalDecision==true){
                        System.out.println("Congrats for your new Daraz!!");
                    }
                    else{
                        System.out.println("Well you can take other colors if u dont want this one !");
                    }
                    break;
                case "brown":
                    System.out.println("Wow Black ? Interesting choice of color!!");
                    costOfMaintain=2000;
                    System.out.println("Because of color black our maintainance cost became higher");
                    initialCost=15000;
                    System.out.println("The final cost becomes "+(initialCost+costOfMaintain));
                    System.out.println("Do you wanna take or no ? \n true/false");
                    finalDecision=inputBoolean();
                    if(finalDecision==true){
                        System.out.println("Congrats for your new Daraz!!");
                    }
                    else{
                        System.out.println("Well you can take other colors if u dont want this one !");
                    }
                    break;
                case "red":
                    System.out.println("Wow Black ? Interesting choice of color!!");
                    costOfMaintain=1500;
                    System.out.println("Because of color black our maintainance cost became higher");
                    initialCost=12000;
                    System.out.println("The final cost becomes "+initialCost+costOfMaintain);
                    System.out.println("Do you wanna take or no ? \n true/false");
                    finalDecision=inputBoolean();
                    if(finalDecision==true){
                        System.out.println("Congrats for your new Daraz!!");
                    }
                    else{
                        System.out.println("Well you can take other colors if u dont want this one !");
                    }
                    break;
                default:
                    System.out.println("Well that color is not available right now !!");
                    System.out.println("sorry for your inconvenience");
                    break;

            }
        }
    }
}
public class launchLoan {
    public static void main(String[] args) {
        personalLoan pl = new personalLoan(10000,10);
        pl.disp();
        pl.Purpose();
        pl.homeImprovementProject();
    }

}
