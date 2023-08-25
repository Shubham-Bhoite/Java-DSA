// Write a Java program to check if a number is a palindrome in Java?

import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();

        if(isPalindrome (palindrome)){
            System.out.println("Number:" + palindrome + "is a palindrome");
        } else{
            System.out.println("Number:" + palindrome + "is a not palindrome");
        }

        public static boolean isPalindrome(int number){
            if (number == reverse){
                return true;
            }
            return false;
        }
    }
}
