import java.util.*;

public class UnaryOperators {
    public static void main(String args[]){
        int a = 10;
        int b = ++a; // Pre increment
        System.out.println(a);
        System.out.println(b);


        int x = 15;
        int y = x++; // Post increment
        System.out.println(x);
        System.out.println(y);


        int c = 20;
        int d = --c; // Pre decrement
        System.out.println(c);
        System.out.println(d);


        int m = 25;
        int n = m--; // Post decrement
        System.out.println(m);
        System.out.println(n);

    }
}
