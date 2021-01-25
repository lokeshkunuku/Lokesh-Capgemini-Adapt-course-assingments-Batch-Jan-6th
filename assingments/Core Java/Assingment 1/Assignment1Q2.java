class ArmstrongNumBetweenRange {
    public int armstrongNumbersInRange(int min, int max) {
        int num, i, rem, temp;
        for (i = min + 1; i < max; i++) {
            temp = i;
            num = 0;
            while (temp != 0) {
                rem = temp % 10;
                num = num + rem * rem * rem;
                temp = temp / 10;
            }
            if (i == num) {
                System.out.print(i + "  ");
            }

        }
        return 0;
    }
}
public class Assignment1Q2 {
    public static void main (String [] args) {
        int min = 100;int max = 999;
        ArmstrongNumBetweenRange armstrongNumBetweenRangeobj = new ArmstrongNumBetweenRange();
      armstrongNumBetweenRangeobj.armstrongNumbersInRange(min,max);



    }
}

