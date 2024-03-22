import java.util.*;

public class Array_06 {
    // better solution
    public static int[] count(int arr[]){
        int cnt0=0;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)cnt0++;
            if(arr[i]==1)cnt1++;
            if(arr[i]==2)cnt2++;
        }
        for(int i=0;i<cnt0;i++){
            arr[i]=0;
        }
        for(int i=cnt0;i<cnt0+cnt1;i++){
            arr[i]=1;
        }
        for(int i=cnt0+cnt1;i< arr.length;i++){
            arr[i]=2;
        }
        return arr;
    }
    // optimal solution
    // dutch national flag solution
    public static void dutchflag(ArrayList<Integer> arr,int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (arr.get(mid) == 0) {
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);
                low++;
                mid++;
            } else if (arr.get(mid) == 1) {
                mid++;
            } else {
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);
                high--;
            }
        }
    }

    public static void main(String [] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        int n=arr.size();
        dutchflag(arr,n);
        System.out.println("After sorting:");
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

    }
}
