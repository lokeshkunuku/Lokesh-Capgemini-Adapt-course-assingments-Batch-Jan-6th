package question1;

import java.util.Scanner;

public class Assignment1q1 {

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
