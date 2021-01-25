package question1;

public class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
        int result = 0;
        int orig = num;
        while(num != 0){
            int remainder = num%10;
            result = result + remainder*remainder*remainder;
            num = num/10;
        }
        //number is Armstrong return true
        if(orig == result){
            return true;
        }

        return false;
    }

}

