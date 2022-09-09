package Assessement;
import java.util.Scanner;
public class SimpleInteresttt {

    public static void main(String args[]) 
    {
        float p, r, t, sinterest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the P : ");
        p = scan.nextFloat();
        System.out.print("Enter the R : ");
        r = scan.nextFloat();
        System.out.print("Enter the T : ");
        t = scan.nextFloat();
        scan.close();
        sinterest = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +sinterest);
        float totalamount=sinterest+p;
        System.out.println("\nTotal about to be paid after the loan duration is: "+totalamount);
    }
}


