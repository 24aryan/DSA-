import java.util.*;
public class Sorting_02 {
    // Merge sort
    // Microsoft question
    // whole explanation of each and every step in the notebook
    public static void merge(int arr[],int low,int mid,int high){
        // temporary arraylist is created to sort elements
        ArrayList<Integer> temp = new ArrayList<>();
        int left=low;
        int right= mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            /// must give space between i and low
            arr[i]=temp.get(i - low);
        }
    }
    public static void mergesort(int arr[],int low,int high){
        if(low>=high) return;
        int mid=(low + high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public static void main(String args[]){
        int arr[]={3,2,4,1,3};
        int n= arr.length;
        System.out.println("before sorting array");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        mergesort(arr,0,n-1);
        System.out.println("after  sorting array");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
