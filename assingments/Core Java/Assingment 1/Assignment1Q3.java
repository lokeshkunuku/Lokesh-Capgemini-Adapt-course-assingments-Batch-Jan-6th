import java.util.Scanner;
class SiCi {
    public double simpleInterest(double principalAmount,double time,double interestRate){
        double Sinterest = (principalAmount * time * interestRate) / 100;
        System.out.print(Sinterest);
        return Sinterest;

    }

    public double compoundInterest(double principalAmount,int time,double interestRate){
        double Cinterest = principalAmount * (Math.pow((1 + interestRate/100), (time))) - principalAmount;
        System.out.print(Cinterest);
        return Cinterest;
    }
}
public class Assignment1Q3 {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principalAmount = input.nextDouble();
        System.out.print("Enter the rate: ");
        double intrestRate = input.nextDouble();
        System.out.print("Enter the time: ");
        int time = input.nextInt();
        SiCi scobject = new SiCi();
        System.out.print("compound Interst : ");
        scobject.compoundInterest(principalAmount,time,intrestRate);
        System.out.print( "\nSimple Interst : ");
        scobject.simpleInterest(principalAmount,time,intrestRate);


    }
}