import java.util.*;
public class Sorting_01 {

    public static void print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }

// in selection sort one value is picked then its swapped then next
    public static void Selection_sort(int arr[],int n){
        // here n-2 can be used as till this point only one step would be remaining it can be written as arr.length-1
        for(int i=0;i<n-1;i++){
            // current element considered as min
            int min=i;
            // now for every i all the j is checked to find minimum
            // so for every element the loop runs
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]) {
                    // if any j is found lesser than current min it becomes new min and then swapped
                    min = j;
                }
                // understand with a,b and c example here the max value is getting swap with min value
                int temp = arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        print(arr,n);
    }
    // bubble sort
    public static void bubble_sort(int arr[],int n){
        // here in bubble sort we are arranging from largest to smallest
        // so loop of selection sort is reversed here same n-1 starting from last element to first
        //reversing to push the largest element to the last
        for(int i=n-1;i>=0;i--){
            //and here  j is the  first index and it compares j nd j+1 which would be greater
            // here j works as primary loop comparing the adjacent  and i is pushing the loop in reverse till first as the last remaining is already sorted
            // i-1 means less than the biggest element because we will be comparing j and j+1 once it is compared
            // if we go to last element we can't compare to anyone and it will give run time error.
            for(int j=0;j<=i-1;j++){
    // even j goes to last second element but it still compares the last element also because if j+1
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        print(arr,n);
    }
public static void insertion_sort(int arr[],int n){
        // here the element is taken and placed at the correct position
    for(int i=0;i<n;i++){
        // initialising j=i
        int j=i;
        // the condition work when j is greater than 0 means first element will not be compared but
        // the second will be compared to check if it is on right place or not
        // it will be compared till every element reach its perfect place
        while (j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                // after swapping of value , j will be decremented  to the prev place
                j--;
        }
    }
    print(arr, n);
}


    public static void main(String args[]){
        int arr[]={13,46,52,1,48,9};
        // if arr.length is used then change from function
        int n=arr.length;
      //  Selection_sort(arr,n);
      //  bubble_sort(arr,n);
        insertion_sort(arr,n);
    }
}
