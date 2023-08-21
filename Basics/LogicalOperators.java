import java.util.*;

public class LogicalOperators {
    public static void main(String args[]){
        System.out.println( (5>2) && (6<3));
        System.out.println( (5>2) && (6>3));

        System.out.println( (5>2) || (6<3));
        System.out.println( (5<2) || (6<3));

        System.out.println( !(5>2));
        System.out.println( !(5<2));
    }
}
