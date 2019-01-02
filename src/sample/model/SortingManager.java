package sample.model;

public class SortingManager {


    //INSERTION SORT
    // Worst-case performance	О(n2) comparisons and swaps
    // Best-case performance	O(n) comparisons, O(1) swaps
    // Average performance	О(n2) comparisons and swaps
    // Worst-case space complexity	О(n) total, O(1) auxiliary
    public static void insertionSort(int[] array){
        int secondPosition = 1;
        int lastPosition = array.length - 1;
        for(int j = secondPosition; j<= lastPosition; j++){
            int key = array[j];
            int i = j-1;
            while(i>=0 && array[i]>key){
                array[i+1] = array[i];
                i = i-1;
            }
            array[i+1] = key;
        }
    }
}
