// To find Smallest and Largest value in given array ==>

import java.util.*;
public class Problem1 {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;  // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }

            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value :" + smallest);
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {1,3,5,6,7,2,4};
        System.out.println("Largest value :" + getLargest(numbers));
    }
}
