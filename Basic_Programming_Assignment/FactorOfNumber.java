package basicAssignment;

import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number which factors of number you wants");
        int n = in.nextInt();
        for(int i =1 ; i <= n ; i++){
            if (n % i == 0){
                System.out.println(" "+i );
            }
        }
    }
}
