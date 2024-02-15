// quick sort
import java.util.*;
public class Sorting_03 {
    public static int fun(int arr[],int low,int high){
        int pivot=arr[low];
        int i = low;
        int j = high;

        while(i<j){
            while(arr[i]<=pivot && i <= high-1){
                i++;
            }
            while(arr[j] > pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
    public static void quicksort(int[] arr,int low,int high) {
        if (low >= high) return;

            int partition = fun(arr, low, high);
            quicksort(arr, low, partition - 1);
            quicksort(arr, partition + 1, high);
    }
    public static void main(String args[]){
        int arr[]={4,6,2,5,7,9,1,3};
        quicksort(arr,0,arr.length-1);
        System.out.println("after  sorting array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

