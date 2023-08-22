// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.*;
public class OddEven {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.println("Enter the number");
            number = sc.nextInt();

            if (number % 2 == 0){
                evenSum = evenSum + number;
            }else{
                oddSum = oddSum + number;
            }
            System.out.print("Do you want to cntinue? Press 1 for Yes or Press 0 for No :");
            choice = sc.nextInt();
        } while (choice == 1);
         System.out.println("Sum of even number:" + evenSum);
         System.out.println("Sum of odd number:" + oddSum);

    }
}
