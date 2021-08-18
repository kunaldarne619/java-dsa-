package basicAssignment;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number = ");
        int n= in.nextInt();

        if (n % 2 == 0){
            System.out.println("Number is prime ");
        }
        else{
            System.out.println("Number Is Odd");
        }
    }
}