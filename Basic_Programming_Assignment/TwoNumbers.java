package basicAssignment;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int a = in.nextInt();
        System.out.print("Enter the number : ");
        int b = in.nextInt();
        if (a>b){
            System.out.println("Greater number is :"+a);
        }
        else if (a<b){
            System.out.println("greater number is :"+b);
        }
    }
}
