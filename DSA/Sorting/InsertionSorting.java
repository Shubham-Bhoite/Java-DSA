import java.util.*;
public class InsertionSorting {
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int previous = i-1;

            //finding out the current position to insert
            while(previous >= 0 && arr[previous] > current){
                arr[previous+1] = arr[previous];
                previous--;
            }

            // insertion of element
            arr[previous+1] = current;
        }
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
}

public static void main(String args[]){
    int arr[] = {5, 4, 1, 3, 2};
    insertionSort(arr);
    printArray(arr);
}
}