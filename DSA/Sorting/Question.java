/*Question : Use the following sorting algorithms to sort an array in DESCENDING order •
a) Bubble Sort
b) Selection Sort
c) Insertion Sort

You can use this array as an example :
[3, 6, 2, 1, 8, 7, 4, 5, 3, 1]
*/

import java.util.*;
public class Question {
    
    // 1) Bubble Sort==>
    public static void bubbleSortDescending(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] < arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
          }
        }
    }
          public static void printArray(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    }
    
    // 2) Selection Sort ==>
    public static void selectionSortDescending(int arr[]){
        for(int i=0; i<arr.length; i++){
           int minPosition= i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPosition] < arr[j]){
                    minPosition = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = temp;
        }
    }

    // 3) Insertion Sort ==>
    public static void insertionSortDescending(int arr[]){
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int previous = i-1;

            //finding out the current position to insert
            while(previous >= 0 && arr[previous] < current){
                arr[previous+1] = arr[previous];
                previous--;
            }

            // insertion of element
            arr[previous+1] = current;
        }
    }


    public static void main(String args[]){
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        //bubbleSortDescending(arr);
        //selectionSortDescending(arr);
        insertionSortDescending(arr);
        printArray(arr);
    }
}
