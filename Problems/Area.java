import java.util.*;
     // Calculate Area of Circle using Input method ==>

public class Area {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = 3.14f* rad *rad;
        System.out.println(area);
    }
}
