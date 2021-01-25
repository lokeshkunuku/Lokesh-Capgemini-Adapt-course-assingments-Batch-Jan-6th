import java.util.Scanner;
class TaxAmount{
    int tax;
    public double calculateTaxAmount(int ctc){
        if(ctc<180001){
            tax = 0;
        }
        else if(180000<ctc && ctc<300001){
            tax=(ctc/100)*10;

        }
        else if(300000<ctc && ctc<500001){
            tax=(ctc/100)*20;

        }
        else if(500000<ctc){
            tax=(ctc/100)*30;

        }
        System.out.println(tax);

    return tax;
    }
}
public class Assignment1Q5 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        int ctc = myObj.nextInt();
        TaxAmount taxobj = new TaxAmount();
        taxobj.calculateTaxAmount(ctc);

    }
}