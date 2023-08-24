// Addition og two numbers ==>
import java.util.*;

public class BasicSum {
    public static void CalculateSum(int num1, int num2){ // parameters or formal parameters
    int sum = num1+num2;
    System.out.println("Sum is:" + sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        CalculateSum(a, b);  // arguments or actual parameters
    }
}
