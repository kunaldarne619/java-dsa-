package basicAssignment;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter principle =");
        int p =in.nextInt();
        System.out.print("enter Time =");
        int t = in.nextInt();
        System.out.print("enter Rate =");
        int r = in.nextInt();
        int si = p* r * t / 100;
        System.out.print("SIMPLE INTEREST IS :" + si);

    }
}
