package basicAssignment;

import java.util.Scanner;

public class RupeeToDollar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount in Rupee = ₹");
        float number = in.nextFloat();
        float numberd = 0.01346f * number;

        System.out.println("₹" +number +" is $"+numberd);
    }
}
