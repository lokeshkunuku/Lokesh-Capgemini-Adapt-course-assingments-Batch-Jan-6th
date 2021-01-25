import java.util.Scanner;

class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
        int result = 0;
        int orig = num;
        while(num != 0){
            int remainder = num%10;
            result = result + remainder*remainder*remainder;
            num = num/10;
        }
        if(orig == result){
            return true;
        }

        return false;
    }

}
public class Assignment1Q1 {

    public static void main(String[] args) {
        ArmstrongOrNot armstrongOrNotobject = new ArmstrongOrNot();
        System.out.println("Please enter a 3 digit number to find if its an Armstrong number:");
        int num = new Scanner(System.in).nextInt();

        if(armstrongOrNotobject.armstrongCheck(num))
            System.out.println("Number : " + num + " is an Armstrong number");
        else{
            System.out.println("Number : " + num + " is not an Armstrong number");
        }

    }

}
