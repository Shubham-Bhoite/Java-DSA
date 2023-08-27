// Print Subarrays => contiguous array

import java.util.*;
public class Problem4 {
    public static void printSubarrays(int numbers[]){
        int totalsubarray = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){ //print
                    System.out.print(numbers[k] + " "); //subarray
                }
                totalsubarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarray =" + totalsubarray);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        printSubarrays(numbers);
    }
}
